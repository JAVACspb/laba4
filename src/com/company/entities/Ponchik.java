package com.company.entities;

import com.company.Clothes;
import com.company.exep.CheckedExep;

public class Ponchik extends Entities{
    private Clothes clothes;


    public Ponchik(int height, int weight, String name, Clothes clothes) {
        super(height, weight, name);
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes)throws CheckedExep {
        if (clothes != Clothes.POLICE){
            throw new CheckedExep("Пончика можно переодеть, только в полицейского");
        }

        this.clothes = clothes;
    }

    public void part1(){
        System.out.println("Пончик переоделся в Полицейского");
        try {
            setClothes(Clothes.POLICE);
        }catch (CheckedExep exep){
            System.out.println("!!!! Пизда пончику !!!!");
            exep.printStackTrace();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ponchik ponchik = (Ponchik) o;
        return this.getName().equals(((Ponchik) o).getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString(){
        return "Ponchik{"
                + "name = '" + super.getName() + '\''
                + ", height = " + super.getHeight()
                + ", weight = " + super.getWeight()
                + ", clothes = " + getClothes()
                + '}';
    }
}


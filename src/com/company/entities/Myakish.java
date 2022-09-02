package com.company.entities;

import com.company.Clothes;
import com.company.Story;
import com.company.exep.CheckedExep;

public class Myakish extends Entities {
    private int trigger = 0;
    private Clothes clothes;

    public Myakish(int height, int weight, String name, Clothes clothes) {
        super(height, weight, name);
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public int getTrigger() {
        return trigger;
    }

    public void setTrigger(int trigger) throws CheckedExep {
        if (trigger != 1) {
            throw new CheckedExep("Изменить состояние можно только на 1");
        }
        this.trigger = trigger;
    }

    public void part1() {
        System.out.println("Мякиш принял пончика за полицейского и старался отделать от него");
    }

    public void part2() { // проверяем
        System.out.println("Мякиш прибыл в деревню и беседовал с нееловцами");
        try {
            setTrigger(1);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void part3() {
        System.out.println("Мякиш заплакал, когда увидел ростки");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Myakish myakish = (Myakish) o;
        return this.getName().equals(((Myakish) o).getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString() {
        return "Myakish{"
                + "name = '" + super.getName() + '\''
                + ", height = " + super.getHeight()
                + ", weight = " + super.getWeight()
                + ", clothes = " + getClothes()
                + '}';
    }


}

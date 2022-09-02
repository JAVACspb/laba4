package com.company.entities;

import com.company.Clothes;
import com.company.FuncInterface;

public class NeElovci extends Entities{


    private Clothes clothes = Clothes.NEELOVCI_CLOTH;

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public NeElovci(int height, int weight, String name, Clothes clothes) {
        super(height, weight, name);
        this.clothes = clothes;
    }
    FuncInterface funcInterface1 = () -> System.out.println("Нееловцы встретили Мякиша очень приветливо");
    FuncInterface funcInterface2 = () -> System.out.println("Нееловцы рассказали Мякишу, что посадили семена");
    FuncInterface funcInterface3 = () -> System.out.println("Нееловцы повели Мякиша в поле, что бы показать семена");

    public void part1(){
        funcInterface1.parts();
    }
    public void part2(){
        funcInterface2.parts();
    }
    public void part3(){
        funcInterface3.parts();
    }

    private interface RedNeck{
        String status();
    }
    public RedNeck redNeckStatusDecribe(){ // local example
        class RedNeckEmotion implements RedNeck{
            @Override
            public String status() {
                return "Настроение заебись !";
            }
        }
        return new RedNeckEmotion();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeElovci neElovci = (NeElovci) o;
        return this.getName().equals(((NeElovci) o).getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString(){
        return "NeElovci{"
                + "name = '" + super.getName() + '\''
                + ", height = " + super.getHeight()
                + ", weight = " + super.getWeight()
                + ", clothes = " + getClothes()
                + '}';
    }

}

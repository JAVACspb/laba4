package com.company.entities;

import com.company.Clothes;
import com.company.trasnsport.Car;

public class Shafer extends Entities{
    private Clothes clothes = Clothes.SHAFER_CLOTH;

    public Shafer(int height, int weight, String name, Clothes clothes) {
        super(height, weight, name);
        this.clothes = clothes;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void part1(Car car){
        System.out.println("Скорость авто была:" + car.getSpeed());
        System.out.println("Шофер прибавил скорость");
        car.setSpeed(100);
        System.out.println("Скорость авто стала:" + car.getSpeed());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shafer shafer = (Shafer) o;
        return this.getName().equals(((Shafer) o).getName());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode();
    }

    @Override
    public String toString(){
        return "Shafer{"
                + "name = '" + super.getName() + '\''
                + ", height = " + super.getHeight()
                + ", weight = " + super.getWeight()
                + ", clothes = " + getClothes()
                + '}';
    }

}

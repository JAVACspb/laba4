package com.company.place;

import com.company.entities.Myakish;

public class NeElovka implements Place{
    private int square;
    private int availability;

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public NeElovka(int square) {
        this.square = square;
    }
    public void availabilitys(Myakish myakish){
        if (myakish.getTrigger() == 1){
            setAvailability(1);
        }
    }
    @Override
    public String Description() {
        return "Площадь = " + square;
    }
}

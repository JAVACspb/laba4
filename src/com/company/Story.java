package com.company;

import com.company.entities.Myakish;
import com.company.entities.NeElovci;
import com.company.entities.Ponchik;
import com.company.entities.Shafer;
import com.company.exep.CheckedExep;
import com.company.plants.Seeds;
import com.company.plants.SeedsStatus;
import com.company.trasnsport.Car;

public class Story {
    public void Start(){
        System.out.println("...");
    }
    Myakish myakish = new Myakish(1,2,"Mayakish",Clothes.MYAKISH_CLOTH);
    Ponchik ponchik = new Ponchik(2,3,"Ponchik",Clothes.PONCHIK_CLOTH);
    public void part1(){
        ponchik.part1();
        myakish.part1();
    }
    Shafer shafer = new Shafer(10,12,"Shafer",Clothes.SHAFER_CLOTH);

    Car car = new Car(10,100);
    public void part2(){
        shafer.part1(car);
    }
    NeElovci neElovci = new NeElovci(10,10,"neElovci",Clothes.NEELOVCI_CLOTH);

    public void part3(){
        myakish.part2();
        neElovci.part1();
    }

    public void part4(){
        neElovci.part2();
        Seeds seeds = new Seeds("Посажено");
        System.out.println("Семена в состоянии: " + seeds.getGrowthDuration());
        neElovci.part3();
    }
    public void rostok_method() throws CheckedExep {
        Seeds.Rostock rostock = new Seeds.Rostock();
        rostock.setSeedsStatus(SeedsStatus.SPROUT);
        if (rostock.getSeedsStatus() == SeedsStatus.DIDNT_SPROUT){
            throw new CheckedExep("Состояние не удовлетворительно");
        }
        rostock.decribe();
    }
    public void part5(){
        try {
            rostok_method();
        }catch (CheckedExep exep){
            System.out.println(exep.getMessage());
            System.out.println("PPPPPPIIIIIZZZDDDDDDEEEEECCCCC");
        }
        myakish.part3();
    }
    public void storyes(){
        part1();
        part2();
        part3();
        part4();
        part5();
    }



}

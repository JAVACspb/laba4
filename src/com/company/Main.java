package com.company;

public class Main {
    public static void main(String[] args) {
        Story story = new Story(){
            @Override
            public void Start() { // anonym class
                System.out.println("История начинается !"); // anonym class
            }
        };
        story.Start(); // anonym class

        story.storyes();

    }
}

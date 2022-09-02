package com.company.trasnsport;

public class Car implements Transport{
    private int speed;
    Motor motor;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Машина спокойно едет");
    }
    public void part1(){
        System.out.println("Машина скрылась из вида");
    }

    public Car(int speed,int engine_pow ) {
        this.speed = speed;
        this.motor = new Motor(engine_pow);
    }

    public class Motor{ // inner non static
        private int engine_pow;

        public Motor(int engine_pow) {
            this.engine_pow = engine_pow;
        }

        public int getEngine_pow() {
            return engine_pow;
        }

        public void setEngine_pow(int engine_pow) {
            this.engine_pow = engine_pow;
        }
    }
}

package com.OOPs;

public class MotorBike {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    private int speed;
    private  int gears;


    public void start(){
        this.speed=30;
        this.gears=1;
        System.out.println("bike has started ");


    }


}

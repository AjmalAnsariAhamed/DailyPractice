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
public void increaseSpeed(int speed){
        if ((this.speed+speed)>120){
            return;
        }
    this.speed+=speed;
}


    public void decreaseSpeed(int speed){
        if ((this.speed-speed)<0){
            return;
        }
        this.speed-=speed;

    }
    public void increaseGears(int gears){
        if ((this.gears+gears)<0){
            return;
        }
        this.gears+=gears;

    }
    public void decreaseGears(int gears){
        if ((this.gears-gears)<0){
            return;
        }
        this.gears-=gears;

    }
}

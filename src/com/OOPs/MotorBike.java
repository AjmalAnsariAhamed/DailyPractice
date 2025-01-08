package com.OOPs;

public class MotorBike {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed>120 && speed<0)
            return;
        this.speed = speed;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        if (this.gears>5 && this.gears<0)
            return ;
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
        this.setSpeed(this.speed+speed);
}


    public void decreaseSpeed(int speed){
        this.setSpeed(this.speed-speed);

    }
    public void increaseGears(int gears){
        this.setGears(this.gears+gears);

    }
    public void decreaseGears(int gears){
        this.setGears(this.gears-gears);

    }
}

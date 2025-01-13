package com.OOPs.Interfaces;

public class MarioGame implements Game{
    @Override
    public void up() {
        System.out.println("player has moved upwards");
    }

    @Override
    public void down() {
        System.out.println("player has moved downwards");
    }

    @Override
    public void left() {
        System.out.println("player has moved left");
    }

    @Override
    public void right() {
        System.out.println("player has moved right");
    }
}

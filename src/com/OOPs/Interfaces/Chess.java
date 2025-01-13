package com.OOPs.Interfaces;

public class Chess implements Game{
    @Override
    public void up() {
        System.out.println("piece has moved upwards");
    }

    @Override
    public void down() {
        System.out.println("piece has moved downwards");
    }

    @Override
    public void left() {
        System.out.println("piece has moved towards left");
    }

    @Override
    public void right() {
        System.out.println("piece has moved towards right");
    }
}

package com.OOPs.Interfaces;

public interface FinalInterface {
    public void sayHello();
   // public final void sayHello2();

    //final methods are not allowed
    //but static methods are but with method body only

    public static void sayHello3() {
        System.out.println("iam Final Iterface");
    }
    //both final and static type variables are allowed
    public static String hello="hello";
    public final String hello2 ="hello2";
    default void defaulMethod(){
        System.out.println("default");
    }
}

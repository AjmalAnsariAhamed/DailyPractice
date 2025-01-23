package com.OOPs.Interfaces;

import javax.xml.transform.Source;

public class FinalInterfaceImpl implements FinalInterface{
    @Override
    public void sayHello() {
        System.out.println("from Implementation");
        }
    public void classMethod(){
        System.out.println("class method");
    }
        public static void main(String args[]){
        FinalInterfaceImpl f= new FinalInterfaceImpl();
String hello2="hello2 from main";
            FinalInterface f2= new FinalInterfaceImpl();
            // way to call a static mathod
            FinalInterface.sayHello3();

            //way to call static and final variables of
            System.out.println(hello+"\t"+hello2);
            //hello2 is also in the interface but here in the main
            // i decalred hello2, it will overrides the interface's hello2;
            f.classMethod();
            //f2.classMethod();// error here the structure will of Interface but in Interface no
            // method classMethod(); error
            f2.sayHello();//here sayHello is in the stucture of Interface
            //when we call it implementation class method will overrides


        }
}

package com.practice;

import java.util.Scanner;

public class While {
    Scanner sc = new Scanner(System.in);
    public void square(){
        int num=0;
        while(true){
            System.out.println("enter a number");
            num=sc.nextInt();
            if (num<0){
                System.out.println("thanks ");
                break;
            }

            System.out.printf("square of %d is %d",num,num*num).println();
        }
    }
    public void squareDoWhile(){
        int num=0;
        do{
            if(num >0)
            System.out.println(num*num);
            System.out.println("enter a number");
            num=sc.nextInt();

        }while(num>=0);
    }
}

package com.practice;

public class MyChar {
    private char ch;
    public MyChar(char ch){
        this.ch=ch;
    }
public boolean isVowel(){
        char chArray[]={'a','e','i','o','u','A','E','I','O','U'};
        for (char c:chArray){
            if (c==this.ch){ System.out.println("it is a vowel");
            return true;}


        }
    System.out.println("it is not an vowel");
        return false;
}
public void isConsonant(){
        if(!this.isVowel()){
            System.out.println("it is a consonant");
        }
    System.out.println("it is not an consonants");
}
public void isAlpha(){
        if ((ch >=65 && ch<=91)|| (ch>=97 && ch<=123)){
            System.out.println("it is a alphabet");
        }
        else
    System.out.println("it is not  a alphabet");

}
public void isNumeric(){
    if (ch>=48 && ch<=57){
        System.out.println("it is a numeric value");
    }
    else
    System.out.println("it is not an number");
}
}
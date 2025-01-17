package com.Collection;

import java.util.HashMap;

public class ObjectsWithHashMap {
    public static void main(String args[]){
        HashMap<OnePiece,String> pirates= new HashMap<>();
        pirates.put(new OnePiece("Luffy","human model nika ",true),"StrawHat Pirates");
        pirates.put(new OnePiece("zoro",true,"Conqueror's Haki"),"StrawHat Pirates");
        System.out.println(pirates);
    }
}

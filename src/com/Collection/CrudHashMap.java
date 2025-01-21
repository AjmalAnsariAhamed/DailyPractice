package com.Collection;

import java.util.HashMap;
import java.util.Map;

class Crud{
    private HashMap<Integer,String>hashMap=new HashMap<>();
    public void add(Integer id,String name){
        hashMap.putIfAbsent(id,name);

    }
    public String delete(Integer id){
     return   hashMap.remove(id);
    }
    public void read(){
        for (Map.Entry<Integer,String> entries:hashMap.entrySet()){
            System.out.println(entries.getKey()+" : "+entries.getValue());
        }
    }
    public String update(Integer id,String name){
       return hashMap.put(id,name);
    }
}

public class CrudHashMap {
    public static void main(String[] args) {
        Crud crudeOperation=new Crud();
        System.out.println(" \n add operation");
        crudeOperation.add(1,"Laffy");
        crudeOperation.add(2,"Zoro");
        crudeOperation.add(3,"Nami");
        crudeOperation.add(4,"Usopp");
        crudeOperation.add(5,"Sanji");
        crudeOperation.add(6,"Chopper");
        crudeOperation.add(7,"Robin");
        crudeOperation.add(8,"Franky");
        crudeOperation.add(9,"Brook");
        crudeOperation.add(10,"jimbei");
        System.out.println(" \n read operation");
        crudeOperation.read();
        crudeOperation.add(11,"Yamato");
        System.out.println(" \n adding to delete operation");
        crudeOperation.read();
        crudeOperation.delete(11);
        System.out.println(" \n delete operation");
        crudeOperation.read();
        crudeOperation.update(1,"Luffy");
        System.out.println(" \n update operation");
        crudeOperation.read();

    }
}

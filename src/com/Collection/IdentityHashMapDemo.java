package com.Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public class IdentityHashMapDemo {
    public static void main(String arg[]){
        HashMap<String,String> map1=new HashMap<>();
        IdentityHashMap<String,String> map2=new IdentityHashMap<>();
        map1.put(new String("Luffy"),"Conquerors Haki");
        map2.put(new String("Luffy"),"Conquerors Haki");
        map1.put(new String("Luffy"),"Hito hito no mi");
        map2.put(new String("Luffy"),"Hito hito no mi");
        System.out.println(map1+"map1");
        System.out.println(map2);

        //{Luffy=Hito hito no mi} map1
        //{Luffy=Hito hito no mi, Luffy=Conquerors Haki} map2
        //it doesnt uses the String's or ddefined hashcode
        //it only uses the Object hashcode
        System.out.println(System.identityHashCode(new String("Luffy") ) +"\t refernce\t"+System.identityHashCode(new String("Luffy") ));
        System.out.println(Objects.hashCode(new String("Luffy"))+" content \t"+ Objects.hashCode(new String("Luffy")));
        for (Map.Entry<String,String> entry:map2.entrySet()){
            System.out.println(entry.getKey()+" :\t"+entry.getValue());


        }

    }
}

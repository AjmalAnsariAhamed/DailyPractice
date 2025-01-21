package com.Collection;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        HashMap<String,Integer> hashMap=new HashMap<>();
        list.add("Hello");
        list.add("Luffy");
        list.add("Hello");
        list.add("Zoro");
        for(String str:list){
            hashMap.put(str,hashMap.getOrDefault(str,0)+1);

        }


        // for stream of String
        String para="The series focuses on Monkey D. Luffy—a young man made of rubber after unintentionally eating the Gum-Gum Fruit—who sets off on a" +
                " journey from the East Blue Sea to find the deceased King of the Pirates Gol D. Roger's ultimate treasure known as the \"One Piece\", and " +
                "take over his prior title. Luffy sets sail as captain of the Straw Hat Pirates,[Jp 15] and is joined by Roronoa Zoro, a swordsman and former" +
                " bounty hunter; Nami, a money-obsessed thief and navigator; Usopp, a sniper and compulsive liar; and Sanji, an amorous but chivalrous cook. They acquire a ship," +
                " the Going Merry[Jp 16]—later replaced by the Thousand Sunny[Jp 17]—and engage in confrontations with notorious pirates. As Luffy and his crew set out on their" +
                " adventures, others join the crew later in the series, including Tony Tony Chopper, an anthropomorphized reindeer doctor; Nico Robin, an archaeologist and former" +
                " Baroque Works assassin; Franky, a cyborg shipwright; Brook, a skeleton musician and swordsman; and Jimbei, a whale shark-type fish-man and former member of the Seven " +
                "Warlords of the Sea who becomes their helmsman. Together, they encounter other pirates, bounty hunters, criminal organizations, revolutionaries, secret agents, scientists, " +
                "soldiers of the morally ambiguous World Government, and various other friends and foes, as they sail the seas in pursuit of their dreams.";
        ArrayList<String> strList=new ArrayList<>(Arrays.asList(para.split(" ")));
        HashMap<String,Integer> hashMap1=new HashMap<>();
        for (String str:strList){
            hashMap1.put(str, hashMap1.getOrDefault(str,0)+1);
        }
        for (String str:hashMap.keySet()){
            System.out.println(str+" : "+ hashMap.get(str));
        }
        for (String str:hashMap1.keySet()){
            System.out.println(str+" : "+ hashMap1.get(str));

        }
        Comparator<String> customComparator=new Comparator<>(){
            @Override
            public int compare(String o1,String o2){
                Integer v1=hashMap1.get(o1);
                Integer v2= hashMap1.get(o2);

                return v2-v1;
            }
        };
        // when value of any strings(in Context of Frequent Count) are Equal lets say <K:Luffy,V:1>, <K:Zoro,V:1> then
        // when <V>value of luffy and zoro are equal it considers that both keys are Equal it does not keep both
        // <Luffy,1>,<Zoro,1> it keeps only one pair
        TreeMap<String,Integer> treeMap= new TreeMap<>(customComparator);
        treeMap.putAll(hashMap1);
        System.out.println(" \n \n \t **********************");
        for(String str:treeMap.keySet()){
            System.out.println(str+" : "+treeMap.get(str));
        }
        System.out.println(treeMap.size()+" hashMap size :"+hashMap1.size());


    }
}

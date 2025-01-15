package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicOpAL {
    public static void main(String args[]){
        ArrayList<Integer> list1= new ArrayList<>();
   for (int i=0;i<10;i++){
      int randomVal=  (int) (Math.random()*(20-10+1))+10;
      list1.add(randomVal);
   }
   System.out.println(list1);

// this wont work because it removing elements but at the same time elements are also shifting towards// left
//   for(Integer i:list1){
//       if(i%2!=0){
//           list1.remove(i);
//       }
//   }
        list1.removeIf(x-> (x%2)!=0);

        System.out.println(list1);

    }
}

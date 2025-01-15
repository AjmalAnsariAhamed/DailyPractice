package com.Collection;

import java.util.*;

public class BasicOpAL {
    public static void main(String args[]){
        ArrayList<Integer> list1= new ArrayList<>();
   for (int i=0;i<10;i++){
      int randomVal=  (int) (Math.random()*(20-10+1))+10;
      list1.add(randomVal);
   }
   System.out.println(list1);

// this won't work because it is removing elements while  iterating elements, also shifting  elements towards left
// 1,3,8,4
// lets say first it removes 1 , next it shall remove 3 but 3 will be shifted towards left after removal 1 but iterator
// will be at second element which is now 8, 3 will be escaped
//   for(Integer i:list1){
//       if(i%2!=0){
//           list1.remove(i);
//       }
//   }
        System.out.println(Collections.max(list1));
        System.out.println(Collections.min(list1));
        list1.removeIf(x-> (x%2)!=0);

        System.out.println(list1);

        ArrayList<Integer> list2= new ArrayList(Arrays.asList(1,2,36,4,5,9,21));
        Comparator<Integer> ascComparator= (x,y)->x-y;
        Comparator<Integer> descComparator= (x,y)->y-x;
        System.out.println(list2+"normal ordering");
        list2.sort(ascComparator);
        System.out.println(list2+"asc");
        list2.sort(descComparator);
        System.out.println(list2+"desc");



    }
}

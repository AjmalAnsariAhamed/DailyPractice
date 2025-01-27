package com.Collection;

import java.util.ArrayDeque;

public class SlidingWindowQ {
    public int[] slidingWindow(int num[],int k){
        int val[]=new int[num.length-k+1];
        int j=0;
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        for (int i=0;i<num.length;i++){
            while(!deque.isEmpty() && num[deque.getLast()]<num[i]){
                deque.pollLast();
            }
            deque.addLast(i);
            if(deque.getFirst()+k==i){
                deque.removeFirst();
            }
            if(i<=k-1){
                val[j++]= deque.getFirst();
            }
        }
return val;
    }
}

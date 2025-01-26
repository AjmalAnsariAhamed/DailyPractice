package com.Collection;

import java.util.*;

public class ReversedQ {
    public static void main(String[] args) {
        Deque<Integer> Q= new LinkedList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        System.out.println(Q);
        Stack<Integer> stack= new Stack<>();
        stack.addAll(Q);
        Q.clear();
        while(!stack.isEmpty()){
            Q.offer(stack.pop());
        }
        System.out.println(Q);

    }
}

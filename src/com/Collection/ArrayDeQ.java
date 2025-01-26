package com.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQ {
    public static boolean isPalindrome(String str){
        if (str==null || str.length()==1){
            return false;
        }
        str.replaceAll("0-9","").toLowerCase();
        Deque<Character> q= new ArrayDeque<>();
        for(char ch:str.toCharArray()){
            q.offerLast(ch);
        }
       while (q.size()>1){
           if(q.pollLast()!=q.pollFirst()){
               return false;
           }
       }
        return true;
        }

    public static void main(String[] args) {
        String st="hello olleh";
        String ans= isPalindrome(st)==true?"its palindrome":"its not an palindrome";
        System.out.println(ans);
        ArrayDeque<Integer> q= new ArrayDeque<>();
        q.offer(1);
        q.offer(8);
        q.offer(3);
        q.offer(8);
        q.offer(12);
        q.offer(5);

        System.out.println(q);
    }

    }


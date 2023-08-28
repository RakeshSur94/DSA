package com.nt.array2D;

import java.util.*;

public class ArrayListDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       ArrayList<Integer>l1=new ArrayList<>();
       l1.add(1);
       l1.add(5);
       l1.add(2);
       l1.add(4);
        // reverseArrayList(l1);
      // Collections.reverse(l1);
        Collections.sort(l1);
       l1.forEach(l->{
           System.out.print(l+" ");
       });



      //printArrayList(l1);


    }
    public static void printArrayList(ArrayList<Integer> l1){
        for(Integer i:l1){
            System.out.println(i);
        }
    }

    public static void reverseArrayList(ArrayList<Integer> l1){
        int left=0; int right=l1.size()-1;
        while(left<right){
            Integer temp=Integer.valueOf(l1.get(left));
            l1.set(left,l1.get(right));
            l1.set(right,temp);
            left++;
            right--;
        }

    }
}

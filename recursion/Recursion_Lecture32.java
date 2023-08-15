package com.nt.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Recursion_Lecture32 {
    public static void main(String[] args) {
        int arr[]={};
       // printArrayByRecursion(arr,0);
       // System.out.println(findSumOfAnArray(arr,0));


    }
    public static void printArrayByRecursion(int arr[],int index){
        int n= arr.length;
        //base case
        if(index==n) return;
        System.out.println(arr[index]);
        //recursive work
        printArrayByRecursion(arr,index+1);
    }
    public static int findBiggerElement(int arr[],int index){
        //base case
        if(index == arr.length-1) return arr[index];
        //small problem ---> index +1 to end of the array ---recursive work
        int smallAns= findBiggerElement(arr, index+1);
        //self work --->final ans
        return Math.max(arr[index],smallAns);
    }
    public static int findSumOfAnArray(int arr[],int index){
        //base case
        if(index == arr.length) return 0;
        //small problem ---> index +1 to end of the array ---recursive work
        int smallAns = findSumOfAnArray(arr, index+1);
        //self work --->final ans
        return arr[index]+smallAns;
    }

}

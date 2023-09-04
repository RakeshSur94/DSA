package com.nt.sorting;

import java.util.Arrays;

//some question on sorting
public class SortingQuestion {
    public static void main(String[] args) {
       // int arr[]={0,5,0,3,42};
       // arrangeInOrder(arr);
        //Lexicographically arrange String
        String fruits[]={"kiwi","banana","kiwz","apple"};
        sortLexicographically(fruits);
        for(String ans:fruits){
            System.out.print(ans+" ");
        }

    }
    //arrange an array in following arr[]{0,5,0,3,42} ans--->arr[]{5,3,42,0,0}

    public static void arrangeInOrder(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            boolean flag=false;
            for(int j=i; j<n-i-1; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
                if(flag==false){
                    break;
                }
            }
        }
       for(int a:arr){
           System.out.print(a+" ");
       }


    }
    //sort the String lexicographically
    public static void sortLexicographically(String fruits[]){

        int n=fruits.length;
        for(int i=0; i<n-1; i++){
            int min_index=i;
            for(int j=i+1; j<n; j++){
              if(fruits[j].compareTo(fruits[min_index])<0){
                  min_index=j;
                }

            }
            if(min_index!=i){
                String temp=fruits[i];
                fruits[i]=fruits[min_index];
                fruits[min_index]=temp;
            }
        }
    }
}


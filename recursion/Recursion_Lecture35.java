package com.nt.recursion;

import java.util.ArrayList;

public class Recursion_Lecture35 {

    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> ans=getSSQ(s);
        /*for(String ss:ans){
            System.out.println(ss);
        }*/
       // ans.stream().map(ss->ss.toUpperCase()).forEach(System.out::println);
        //print SSQ
       // printSSQ(s,"");
        int arr[]={2,4,5};
        printSubSetSum(arr,arr.length,0,0);


    }
    //given String input find out the SSQ
    public static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans= new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curValue=s.charAt(0);
        //small ans
        ArrayList<String> smallAns=getSSQ(s.substring(1));
        for(String ss:smallAns){
            ans.add(ss);
            ans.add(curValue + ss);
        }
        return  ans;

    }
    public static void printSSQ(String s,String currAns){
        //base case
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char currValue=s.charAt(0);
        String remString=s.substring(1);
        printSSQ(remString,currAns+currValue);
        printSSQ(remString,currAns);


    }
    public static void printSubSetSum(int arr[],int n,int index,int sum){
        //base case
        if(index>=arr.length){
            System.out.println(sum);
            return;
        }
        printSubSetSum(arr,n,index+1,sum+arr[index]);//include
        printSubSetSum(arr,n,index+1,sum);//exclude

    }
}

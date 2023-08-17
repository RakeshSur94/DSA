package com.nt.recursion;

import java.util.Scanner;

//Recursion In String
public class Recursion_Lecture34 {
    public static void main(String[] args) {
        //print String
        //Scanner sc=new Scanner(System.in);
       // System.out.println("Enter the name::");
        //String name=sc.nextLine();
        //printString(name);
        //remove all the occurrences of 'a' from a String
        String s="abcaad";
        //char target='a';
        //System.out.println(removeChar1(s,target));
        System.out.println(removeChar2(s,0));

    }
    //iterate a String
    public static void printString(String s){
        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
    //remove all the occurrences of 'a' from a String
    //brutForce
    public static String removeChar1(String s,char target){
        String ans="";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=target){
                ans += s.charAt(i);
            }

        }
        return ans;
    }
    //remove all the occurrences of 'a' from a String
    //using recursion
    public static String removeChar2(String s,int index){
        //base case
        if(index == s.length()) return "";
        //recursive work
        String smallAns=removeChar2(s,index+1);
        //self work
        char currChar=s.charAt(index);
        if(currChar !='a'){
          return  currChar + smallAns;
        }
        return smallAns;
    }

}

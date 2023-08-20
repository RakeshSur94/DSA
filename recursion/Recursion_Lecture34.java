package com.nt.recursion;

import java.util.Arrays;
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
        String s="LeveLL";
        //char target='a';
        //System.out.println(removeChar1(s,target));
        //System.out.println(removeChar2(s,0));
       // System.out.println(removeChar3(s));
        //reverseString(s,s.length()-1);
        //System.out.print(reverseString2(s,0));
       // System.out.println(reverseString3(s));
        //System.out.println(isPalindrome(s));
        /*if(isPalindrome2(s).equals(s)){
            System.out.printf("%s is palindrome!!!",s);
        }
        else{
            System.out.printf("%s is palindrome!!!",s);
        }*/
      //  System.out.println(isPalindrome3(s,0,s.length()-1));
        int num=1212121;
        System.out.println(isNumberPalindrome(num));



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
    //remove all the occurrences of 'a' from a String
    //using recursion another approach
    public static String removeChar3(String s){
        //base case
        if(s.length()==0) return "";
        //recursive work
        String smallAns=removeChar3(s.substring(1));
        //self work
        char currChar=s.charAt(0);
        if(currChar !='a'){
            return currChar+smallAns;
        }
        return smallAns;
    }
    //reverse a String 1st approach
    public static void reverseString(String s,int index){
        //base case
        if(index<0) return;
        //self work
        System.out.print(s.charAt(index)+" ");
        //recursive work
        reverseString(s,index-1);
    }
    //reverse a String 2nd approach
    public static String reverseString2(String s,int index){
        //base case
        if(index==s.length()) return "";
       //recursive work + self work
        return reverseString2(s,index+1)+s.charAt(index);

    }
    //reverse a String 3rd approach
    public static String reverseString3(String s){
        //base case
        if(s.length()==0) return "";
        //recursive work + self work
        return reverseString3(s.substring(1))+s.charAt(0);

    }
    public static boolean isPalindrome(String s) {

        String ans="";
        //String newAns=s;
       for (int i=s.length()-1; i>=0; i--){
           ans +=s.charAt(i);
       }
         if(ans.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
    public static String  isPalindrome2(String s){
        //base cas
        if(s.length()==0) return "";

        return isPalindrome2(s.substring(1))+s.charAt(0);

    }
    public static boolean isPalindrome3(String s,int l,int r){
        //base case
        if(l >= r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome3(s,l+1,r-1));
    }
    // recursive function to find the reverse of a given number
    public static int reverse_number(int n,int rev_num){
        if(n==0){
            return rev_num;
        }
        rev_num=rev_num*10+n%10;
        return reverse_number(n/10,rev_num);
    }
    //find the number is palindrome of not
    public static boolean isNumberPalindrome(int n){
        int revNum=reverse_number(n,0);
        if(n==revNum) {
            return true;
        }
        else{
            return false;
        }
    }



}

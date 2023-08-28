package com.nt.string;

public class String_Lecture {
    public static void main(String[] args) {
        String s="piiiippiiipi";
        System.out.println(replace(s));
    }
    public static String replace(String s){
        //base case
        if(s.length()<=1) return s;
        if(s.charAt(0)=='p' && s.length()>=2 && s.charAt(1)=='i'){
            return "3.14"+replace(s.substring(2,s.length()));
        }
        return s.charAt(0) + replace(s.substring(1,s.length()));
    }
}

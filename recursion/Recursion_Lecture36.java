package com.nt.recursion;

public class Recursion_Lecture36 {
    public static void main(String[] args) {
        int arr[]={10,30,40,20};
        System.out.println(best(arr,arr.length,0));
        //key paid combination
        String s="253";
        String kp[]={"","","abc","def","jkl","mno","pqrs","tuv","wxyz"};
        //            0  1   2    3     4      5     6      7     8
        combination(s,kp,"");
    }

    private static int best(int[] h, int n, int index) {
        //base case
        if(index==n-1) return 0;
        int op1=Math.abs(h[index]-h[index+1]) +best(h,n,index+1);
        if(index==n-2) return op1;
        int op2=Math.abs(h[index]-h[index+2]) + best(h,n,index+2);
        return Math.min(op1,op2);

    }
    //key paid combination
    public static void combination(String digits,String kp[],String res){
        if(digits.length()==0){
            System.out.print(res+" ");
            return;
        }
       int currNum= digits.charAt(0)-'0'; //2
        String currChoices=kp[currNum]; //abc
        for(int i=0; i<currChoices.length(); i++){
            combination(digits.substring(1),kp,res + currChoices.charAt(i));
        }

    }
}

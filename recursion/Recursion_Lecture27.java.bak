package com.nt.recursion;

import java.util.Scanner;

public class Recursion_Lecture27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        //printNaturalNumber(n);
        //System.out.println(factorial(n));
       // fibonacci(n);
        for(int i=0; i<=n; i++){
            System.out.println(nthFibonacci(i));
        }

    }

    public static void printNaturalNumber(int n) {
        if(n==1){
            System.out.println(1);//base case
            return;
        }

        //System.out.println(n);//prove
        printNaturalNumber(n-1);//assumption
        System.out.println(n);


    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }

        int ans=factorial(n-1)*n;
        return ans;

    }
    static void fibonacci(int n){
        int a=0;
        int b=1;
        int c=0;
        for(int i=1; i<=n; i++){
           System.out.print(a +" ");
           c=a+b;
            a=b;
            b=c;

        }



    }
    static int nthFibonacci(int n){
        //base case
        if(n==0||n==1) return n;
            //recursive approch
        return nthFibonacci(n-1)+nthFibonacci(n-2);


    }

}

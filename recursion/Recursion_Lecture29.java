package com.nt.recursion;

public class Recursion_Lecture29 {
    public static void main(String[] args) {
        int a=523412;
        //System.out.println(sumOfDigits(a));
       // System.out.println(countOfDigits(a));
        int n=5; int p=3;
        //System.out.println(power(n,p));
        //System.out.println(powerUsingRecursion(n,p));
        System.out.println(powerUsingRecursionOptimization(n,p));

    }
    public static int sumOfDigits(int n){
        //base case
        if(n>=0 && n<=9) return n;
        //recursive work
        return sumOfDigits(n/10)+sumOfDigits(n%10);
    }
    static int countOfDigits(int n){
        if(n>=0 && n<=9) return 1;
        return countOfDigits(n/10)+1;

    }
    static int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }
    static int powerUsingRecursion(int p, int q)
    {
       if(q==0) return 1;
       return powerUsingRecursion(p,q-1)*q;
    }
    static int powerUsingRecursionOptimization(int p, int q)
    {
        if(q==0) return 1;
        int smallPow=powerUsingRecursionOptimization(p,q/2);
        if(q % 2==0){
            return smallPow*smallPow;
        }
        return p * smallPow * smallPow;
    }



}

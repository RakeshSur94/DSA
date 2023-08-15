package com.nt.recursion;

import java.util.Scanner;

public class Recursion_Lecture31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter X");
        int x=sc.nextInt();
        //int y=sc.nextInt();
        //System.out.println(gcd2(x,y));
        //System.out.println(gcdByRecursion(x,y));
        System.out.println(isArmstrongNumber(x));
    }
    public static int gcd(int x,int y){
        for(int i=x; i>0; i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 0;
    }
    public static int gcd2(int x,int y){

        while(x % y !=0){
            int rem=x % y;
            x=y;
            y=rem;


        }
        return y;
    }
    public static int gcdByRecursion(int x,int y){
        //base case
        if( y ==0) return x;
        //recursive work
        return gcdByRecursion(y,x % y);
    }
    public static boolean isArmstrongNumber(int n){
        int ans=0;
        int number=n;
        int count=0;
        while(number > 0){
            number=number/10;
            count++;

        }
        number=n;
        while(number > 0){
            int rem= number % 10;
            ans += Math.pow(rem,count);
            number=number/10;
           // System.out.println(ans);
        }
        if(n==ans){
            return  true;
        }
            return false;
    }
}

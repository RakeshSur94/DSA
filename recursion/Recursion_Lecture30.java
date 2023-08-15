package com.nt.recursion;

public class Recursion_Lecture30 {
    public static void main(String[] args) {
       // multipleOfNum(3,8);
        //multipleOfNumByRecursion(3,8);
        System.out.println(sumOfNumbers2(10));
    }

    private static void multipleOfNum(int p, int k) {
        int ans=1;
        for(int i=1; i<=k; i++){
            ans=p*i;
            System.out.print(ans+" ");

        }

    }
    public static void multipleOfNumByRecursion(int p, int k) {
        //base case
        if (k == 1){
            System.out.println(p);
        return;
    }
      //recursive work
        multipleOfNumByRecursion(p,k-1);
        System.out.println(p*k);

        }
        public static int sumOfNumbers(int n){
        //base case
            if(n==0)return n;
            //recursive work

            return sumOfNumbers(n-1)+n;
        }
    public static int sumOfNumbers2(int n){
        //base case
        if(n==0)return n;
        if(n%2==0){
            return sumOfNumbers2(n-1)-n;
        }
        return sumOfNumbers2(n-1)+n;
    }

}

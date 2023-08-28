package com.nt.lambda;
@FunctionalInterface
interface Cab{
    public int m1(int a, int b);
}


public class FunctionalIntegerfaceDemo {
    public static void main(String[] args) {
        Cab ola= ( a, b)->{
            int c=a+b;
            System.out.println("Cab is here............"+c);
            return (a+b);
        };

        ola.m1(2,3);

    }


}

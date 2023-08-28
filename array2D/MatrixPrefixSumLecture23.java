package com.nt.array2D;

import java.util.Scanner;

public class MatrixPrefixSumLecture23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row and Column");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter "+r*c+" vlaue");
        for (int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the value of l1 r1 l2 and r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();


        System.out.println(findPrefixSum(arr,l1,r1,l2,r2));
        //int result= findPrefixSum2(arr,l1,r1,l2,r2);
       // System.out.println(result);
        System.out.println(findPrefixSum3(arr,l1,r1,l2,r2));


    }
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int findPrefixSum(int matrix[][],int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    public static int findPrefixSum2(int matrix[][],int l1,int r1,int l2,int r2){
        int sum=0;
        prefixSum(matrix);
        for(int i=l1; i<=l2; i++){
            if(r1>=1)
                sum+=matrix[i][r2]-matrix[i][r1-1];
            else
                sum+=matrix[i][r2];


        }
        return sum;

    }
    public static   int findPrefixSum3(int matrix[][],int l1,int r1, int l2,int r2){
        int sum=0 , up=0 , left=0 , leftUp=0;
        int ans=0;
        prefixSum(matrix);
        sum=matrix[l2][r2];
        if(l1>=1){
            up=matrix[l1-1][r2];
        }
        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if(l1>=1 && r1>=1) {
            leftUp = matrix[l1 - 1][r1 - 1];
        }

        ans=sum-up-left+leftUp;
        return ans;





    }
    public static void prefixSum(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0; i<r; i++){
            for(int j=1; j<c; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

}

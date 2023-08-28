package com.nt.array2D;

import java.util.Scanner;

public class Array_lecture19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of Row:: and column ");
        /*int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" element");
        for(int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                arr[i][j]=sc.nextInt();
            }
        }*/
      // int ans[][]= transPoseMatrix(arr,r1,c1);
        //transPoseMatrixInPlace(arr);
        //printMatrix(arr);
       // int ans[][]=arrayRotation(arr,c1,r1);
        //arrayRotation(arr,r1,c1);
      // int ans[][]=arrayRotation(arr,r1);
       // swapMatrix(ans);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int ans[][]=pasclsArray(n);
        printMatrix(ans);
    }
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transPoseMatrix(int arr[][],int r,int c){

        int ans[][]=new int[c][r];
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    public static void transPoseMatrixInPlace(int arr[][],int r,int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
       // printMatrix(arr);
    }
    static void swapMatrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[0].length - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    static void swapMatrixArray(int arr[]){

        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }


    public static int[][]  arrayRotation(int arr[][],int n){
        transPoseMatrixInPlace(arr,n,n);
        for(int i=0; i<n; i++){
            swapMatrixArray(arr[i]);
        }

        return arr;

    }
    public static int[][] pasclsArray(int n){
        int ans[][]=new int[n][];
        for(int i=0; i<n; i++){
            ans[i]=new int[i+1];
            ans[i][0]=ans[i][i]=1;
            for(int j=1; j<i; j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

}

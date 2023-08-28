package com.nt.array2D;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*System.out.println("Enter number of Row:: and column ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("Enter "+r1*c1+" element");
        for(int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                a[i][j]=sc.nextInt();
            }
        }

         */
        System.out.println("Enter number of Row and column ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("Enter "+r2*c2+" element");
        for(int i=0; i<r2; i++){
            for (int j=0; j<c2; j++){
                b[i][j]=sc.nextInt();
            }
        }
       int ans[][]= reverseAnMatrix(b);
        print2DArray(ans);



    }
    static void print2DArray(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void add(int a[][],int r1,int c1, int b[][],int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input :::: Addition Not possible");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                sum[i][j]=a[i][j]+b[i][j];

            }
        }
        print2DArray(sum);
    }
    public static void twoMatrixMul(int a[][],int r1,int c1,int b[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Invalid Entry Dimenson is wrong:::::");
            return;
        }
        int ans[][]=new int[r1][c2];
        for(int i=0; i<r1; i++){//row
            for(int j=0; j<c2; j++){//column
                for(int k=0; k<c1; k++){
                    ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print2DArray(ans);
    }
    public static void swapArray(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;



        }

    public static int[][] reverseAnMatrix(int arr[][]) {
        /*int right=c-1;
        int ans[][]=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(right>=0){
                    ans[i][j]=arr[i][right];
                    right--;
                }
            }
            right=c-1;
        }
        return ans;


    }*/
        for (int i = 0; i < arr.length; i++) {
            int left = 0;
            int right = arr[0].length-1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }

        }
        return arr;

    }
    }

package com.nt;

import java.util.Scanner;

public class Array_Lecture21 {
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
        spiralOrderAntiClockWise(arr,r,c);
       // printMatrix(arr);
       // spiralArray(arr,r,c);
       // printMatrix(arr);
       // System.out.println("Enter the element");
       // int n=sc.nextInt();
       // int ans[][]=spiralArray2(n);
        //printMatrix(ans);

    }
    public static void printMatrix(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralArray(int [][]matrix,int r,int c){
        int topRow=0; int bottomRow=r-1; int leftColumn=0; int rightColumn=c-1;
        int totalElements=0;

        while(totalElements<r*c){
            //topRow--->leftColumn to RightColumn
            for(int j=leftColumn; j<=rightColumn&&totalElements<r*c; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            //RightColumn---->topRow to BottomRow
            for(int i=topRow; i<=bottomRow&&totalElements<r*c; i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;
            //bottomRow-->RightColumn to LeftColumn
            for (int j=rightColumn; j>=leftColumn&&totalElements<r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftColumn-Bottom Row to TopRow
            for(int i=bottomRow; i>=topRow&&totalElements<r*c; i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;

        }
    }
    public static int[][] spiralArray2(int n){
        int topRow=0,bottomRow=n-1,leftColumn=0,rightColumn=n-1;
        int matrix[][]=new int[n][n];
        int curr=1;

        while(curr <= n * n){
            //topRow--->leftColumn to rightColumn
            for(int j=leftColumn; j<=rightColumn&&curr<=n*n; j++){
                matrix[topRow][j]=curr++;
            }
            topRow++;
            //rightColumn--->topRow to bottomRow
            for(int i=topRow; i<=bottomRow&&curr<=n*n; i++){
                matrix[i][rightColumn]=curr++;
            }
            rightColumn--;
            //bottomRow--->RightColumn  to leftColumn
            for(int j=rightColumn; j>=leftColumn&&curr<=n*n; j--){
                matrix[bottomRow][j]=curr++;
            }
            bottomRow--;
            //leftColumn= bottomRow to topRow
            for(int i=bottomRow; i>=topRow&&curr<=n*n; i--){
                matrix[i][leftColumn]=curr++;
            }
            leftColumn++;
        }
        return matrix;
    }
    public static void spiralOrderAntiClockWise(int matrix[][],int r,int c){
        int topRow=0 , bottomRow=r-1 , leftColumn=0 , rightColumn=c-1;
        int totalElement=0;
        while(totalElement < r*c) {
            //leftColumn--->topRow to bottomRow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(matrix[i][leftColumn] + " ");
                totalElement++;
            }
            leftColumn++;

            //bottomRow--> leftColumn to RightColumn
            for (int j = leftColumn; j <= rightColumn && totalElement < r * c; j++) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElement++;
            }
            bottomRow--;
            //rightColumn--> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][rightColumn] + " ");
                totalElement++;
            }
            rightColumn--;
            for (int j = rightColumn; j >= leftColumn && totalElement < r * c; j--) {
                System.out.print(matrix[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
        }
    }
}

package com.nt.sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[]={4,5,1,3,8};
        insertionSort(arr);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}

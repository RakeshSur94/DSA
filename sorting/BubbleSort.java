package com.nt.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        //bubbleSort(arr);
       // bubbleSort2(arr);
        bubbleSort3(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort2(int arr[]){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

    }
    //optimize code
    public static void bubbleSort3(int arr[]){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            boolean flag=false;
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;

                }

            }
            if(flag==false){
                return;
            }
        }

    }
}

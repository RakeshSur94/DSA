package com.nt.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={5,6,8,2,4};
        int n=arr.length;
        System.out.println("Array before sort");
        display(arr);
        System.out.println();
        System.out.println("Array after sort");
        quickSort(arr,0,n-1);
        display(arr);
    }
    public static void display(int arr[]){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static int partition(int arr[],int start,int end){
        int pivot=arr[start];
        int count=0;
        for(int i=start+1; i<=end; i++){
            if(arr[i]<pivot)
                count++;
            }
            int pivotIndex=start+count;
            swap(arr,start,pivotIndex);
            int i=start,j=end;
            while (i<pivotIndex && j>pivotIndex){
               while (arr[i]<=pivot)i++;
               while (arr[j]>pivot)j--;

               if(i < pivotIndex && j>pivotIndex){
                   swap(arr,i,j);
                   i++;
                   j--;
               }
            }
            return pivotIndex;


    }
    public static void quickSort(int arr[],int start,int end ){
        //base case
        if(start>=end)return;
        int pi=partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);


    }
}

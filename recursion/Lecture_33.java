package com.nt.recursion;

import java.util.ArrayList;

public class Lecture_33 {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2,5};
        int target=2;
        int n=arr.length;
       /*if(isElementPresent(arr,n,target,0))
           System.out.println("YES");
       else
           System.out.println("NO");

*/
        //System.out.println(findIndex(arr,n,target,0));
        //findMatchIndices(arr,n,target,0);
        ArrayList<Integer> ans=findAllIndices(arr,n,target,0);
        for (Integer i : ans) {
            System.out.print(i+" ");
        }
    }
    //check whether target value is exist or not
    public static boolean isElementPresent(int arr[],int n,int target,int index){
        //base case
        if(index >= n) return false;
        //self work
        if(arr[index]==target) return true;
        //recursive work
       return isElementPresent(arr,n,target,index+1);


    }
    //check whether target value is exist or not and then print the index number
    public static int findIndex(int arr[],int n,int target,int index){//base case
        if(index >= n) return -1;
        //self work
        if(arr[index]==target) return index;
        //recursive work

        return findIndex(arr,n,target,index+1);


    }
    //check whether target value is exist or not and then print the indices numbers
    public static void findMatchIndices(int arr[],int n,int target,int index){//base case
        if(index >= n) return;
        //self work
        if(arr[index]==target)
            System.out.print(index+" ");
        //recursive work
       findMatchIndices(arr,n,target,index+1);
    }
    //check whether target value is exist or not and then print the indices in an ArrayList<Integer>
    public static ArrayList<Integer> findAllIndices(int arr[], int n, int target, int index){
        ArrayList<Integer> ans=new ArrayList<>();
        //base case
        if(index >= n) return ans;
        //self work
        if(arr[index]==target)
            ans.add(index);
        ArrayList<Integer> smallAns= findAllIndices(arr,n,target,index+1);
        ans.addAll(smallAns);
        return ans;

    }
    //check whether the array is sorted or not if sorted then print YES or print NO
    public static boolean isSortedOrNot(int arr[], int n, int index){
        
    }
}

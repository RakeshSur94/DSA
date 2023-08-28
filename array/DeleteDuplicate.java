package com.nt.array;

public class DeleteDuplicate {
    private int a;
    private Integer b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }
    public void setB(Integer b){

    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4};
       // int ans[]=findDuplicateElement(arr);
       //printArray(ans);
       // integerToString();
        DeleteDuplicate d= new DeleteDuplicate();

        //d.getB()
        System.out.println(d.getA());
        System.out.println(d.getB());


    }
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
        }
    }
    public static int[] findDuplicateElement(int arr[]){
        int n=arr.length;

        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            if(i==n){
                ans[i]=arr[i];
            }

            if(arr[i]<arr[i+1]){
                ans[i]=arr[i];
            }
            else{
                continue;
            }
        }



            return ans;
    }
    static void integerToString(){
        int a=102;
        String b="162655";
        //String string=String.valueOf(a);
        double c=Double.parseDouble(b);
        System.out.println(c);

    }

}

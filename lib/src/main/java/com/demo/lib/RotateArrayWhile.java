package com.demo.lib;

public class RotateArrayWhile {
    public static void main(String[] arg){
        int[] arrInput={10,20,3,4,50,6,7};
        //o/p> {3,4,5,6,7,1,2}
        int d=2;
        reverseArray(arrInput,arrInput.length,d);
        printArray(arrInput);
    }
    private static void printArray(int[] arr){
        for (int index=0;index<arr.length;index++){
            System.out.println("Element:"+arr[index]);
        }
    }
    private static int[] reverseArray(int[] arrInput, int n,int d) {
        int p=0;//look should be 2 time as d-2
        while(p<d){
            int last=arrInput[0];
            System.out.println("last:"+last);
            for (int k=0;k<arrInput.length-1;k++){
                arrInput[k]=arrInput[k+1];
            }
            arrInput[n-1]=last;
            System.out.println("Array Input:"+arrInput[n-1]);
            System.out.println("p:"+p);
            p++;
        }
        return arrInput;
    }
}

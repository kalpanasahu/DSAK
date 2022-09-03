package com.demo.lib;

import jdk.internal.org.jline.utils.Log;

public class ArrayRotationUsingTemp {
    public static void main(String[] args){
        int[] arrInput={1,2,3,4,5,6,7};
        //o/p> {3,4,5,6,7,1,2}
        int d=2;
        int n=arrInput.length;
        rotateArray(arrInput,d,n);
        printArray(arrInput);
    }
    private static void printArray(int[] arr){
        for (int index=0;index<arr.length;index++){
            System.out.println("Element:"+arr[index]);
        }
    }
    private static int[] rotateArray(int[] arr,int d,int n){
        int[] temp=new int[n];
        int k=0;// temporary array index
        for (int index=d;index< arr.length;index++){
            temp[k]=arr[index];
            k++;
        }
        for (int index=0;index<d;index++){
            temp[k]=arr[index];
            k++;
        }
        for (int index=0;index<arr.length;index++){
            arr[index]=temp[index];
        }

        return arr;
    }
}

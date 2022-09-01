package com.demo.lib;
/*
Create An Array, add values
and print each value
 */
public class AccessingArray {
    public static void main(String[] args){
        int[] arr;
        arr=new int[10];
        addValues(arr);
    }
    private static void addValues(int[] arr){
        int tempValue=10;
        for (int i=0;i<arr.length;i++){
           arr[i]=tempValue;
            tempValue=tempValue+10;
            displayValues(i,arr[i]);
        }
    }
    private static void displayValues(int index,int arrItem){
            System.out.println("Element at index "+index+":"+arrItem);
    }
}

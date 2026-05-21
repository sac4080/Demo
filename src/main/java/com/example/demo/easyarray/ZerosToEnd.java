package com.example.demo.easyarray;

import java.util.Arrays;

//Problem Statement: You are given an array of integers,
// your task is to move all the zeros in the array to the end of the array and
// move non-negative integers to the front by maintaining their order.
//Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
//Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
public class ZerosToEnd {
    public static  void main( String[] args){
        int[] arr= {1,2,0,1,0,4,0};
        int i=-1;

        for(int j = 0;j<arr.length;j++){
            if(arr[j] == 0){
                i=j;
                break;
            }
        }

        for(int j=i+1;j<arr.length;j++){
            if(arr[j] != 0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        i++;
                    }
        }
        System.out.println(Arrays.toString(arr));
    }
}

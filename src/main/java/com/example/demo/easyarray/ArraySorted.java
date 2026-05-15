package com.example.demo.easyarray;

//Problem Statement:
// Given an array of size n, write a program to check if the given array is sorted
// in (ascending / Increasing / Non-decreasing) order or not.
// If the array is sorted then return True, Else return False.
//Input: N = 5, array[] = {1,2,3,4,5}
//Output: True.
//Explanation: The given array is sorted i.e Every element in the array is smaller than
// or equals to its next values, So the answer is True.
public class ArraySorted {
    public static void main(String[] args){
        int[] arr = {5,4,6,7,8};
        int temp = arr[0];
        boolean flag = true;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] >= temp){
                temp = arr[i];
            }
            else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

    }
}


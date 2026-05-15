package com.example.demo.easyarray;

//Problem Statement: Given an array, we have to find the largest element in the array.
//Input:
//arr[] = {2, 5, 1, 3, 0}
//Output: 5
//Explanation: 5 is the largest element in the array.

public class LargestElement {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0,8};
        int max = 0;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}

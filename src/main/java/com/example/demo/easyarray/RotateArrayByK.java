package com.example.demo.easyarray;

//Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
//Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
//Output : [6, 7, 1, 2, 3, 4, 5]
//Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
//rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5]

import java.util.Arrays;

public class RotateArrayByK {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k=2;
        int n= arr.length;
        int K = k%n;
        //right shift
        reverse(arr,0,n-1);
        reverse(arr,0,K-1);
        reverse(arr,k,n-1);

        System.out.println(Arrays.toString(arr));

        //left shift
        int[] ar = {1,2,3,4,5,6,7};

        reverse(ar,0,K-1);
        reverse(ar,k,n-1);
        reverse(ar,0,n-1);

        System.out.println(Arrays.toString(ar));


    }

    private static void reverse(int[] ar, int start, int end){

        while(start < end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;
        }
    }
}

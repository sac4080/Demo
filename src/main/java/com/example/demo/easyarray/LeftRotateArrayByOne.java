package com.example.demo.easyarray;

//Problem Statement: Given an integer array nums, rotate the array to the left by one.
//Input: nums = [1, 2, 3, 4, 5]
//Output: [2, 3, 4, 5, 1]
//Explanation: Initially, nums = [1, 2, 3, 4, 5]
//Rotating once to the left results in nums = [2, 3, 4, 5, 1].

import java.util.Arrays;

public class LeftRotateArrayByOne {
   public static void main(String[] args){
       int[] nums = { 1,2,3,4,5};

       int temp= nums[0];
       for(int i=0; i<nums.length-1; i++){
           nums[i] = nums[i+1];
       }
       nums[nums.length-1] = temp;

       System.out.println(Arrays.toString(nums));
   }
}

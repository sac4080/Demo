package com.example.demo.easyarray;

//Problem Statement: Given an array, find the second smallest and second largest element in the array.
// Print ‘-1’ in the event that either of them doesn’t exist.

//Input:[1, 2, 4, 7, 7, 5]
//Output:
//Second Smallest : 2
//Second Largest : 5
//Explanation:
//The elements are sorted as 1, 2, 4, 5, 7, 7.
//Hence, the second smallest element is 2, and the second largest element is 5.

public class SecondSmallestAndlargest {
    public static void main(String[] args){
        int[] arr= {1,4,6,5};
        int secondLargest = Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i : arr){
            if(i > largest ){
                secondLargest = largest;
                largest = i;
            } else if ( i < largest && i > secondLargest)  {
                secondLargest = i;
            }
        }
        for(int i : arr){
            if(i < smallest ){
                secondSmallest = smallest;
                smallest = i;
            } else if ( i > smallest && i < secondSmallest)  {
                secondSmallest = i;
            }
        }

        System.out.println(secondLargest);
        System.out.println(secondSmallest);
    }
}

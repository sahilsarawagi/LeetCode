package com.company;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySums {
    public static void main(String[] args) {
      int[] nums = {1,2,3,4};
       int n = 4; int left = 3; int right = 4;
        System.out.println(rangeSum(nums,  n,  left, right));
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[(n)*(n+1)/2];
        int sum;
        int k =0;
        for (int i = 0; i < nums.length; i++) {
            sum =0;
            for (int j = i; j < nums.length; j++) {
                sum+= nums[j];
                arr[k] = sum;
                k++;
            }
        }
        Arrays.sort(arr);
        return sum(arr,left-1,right-1);
    }

    private static int sum(int[] arr, int left, int right) {
        long sum=0;
        while (left<=right){
            if (left==right){
                sum += arr[left] % 1000000007;
            }
            else {sum+= arr[left]+arr[right]% 1000000007;}
           left++;
           right--;
        }
        sum = sum% 1000000007;
        return (int) sum;
    }
}

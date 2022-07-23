package com.company;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }
    public static void reverse(int[] arr)
    {   int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        int count = 3;
        int i=0;
        int max=nums[i];
        int lastmax=Integer.MIN_VALUE;
        while (count>0){
            if (i>= nums.length){
                return nums[0];
            }
            max=nums[i];
            if (max!=lastmax){
                count--;
                lastmax=max;
            }
            i++;
        }
        return max;
    }
}

package com.company;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4};
       int ans=  largestPerimeter(arr);
        System.out.println(ans);
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length-1;
        int max =0;
        while (n>=2){
            if (nums[n-2]+nums[n-1]>nums[n]){
                return nums[n-2]+nums[n-1]+nums[n];
            }
            n--;
        }

        return max;
    }

}

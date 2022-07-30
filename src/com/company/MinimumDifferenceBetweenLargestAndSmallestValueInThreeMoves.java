package com.company;

import java.util.Arrays;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public static void main(String[] args) {
        int[] nums = {5,9,3,7,595,32,48,121,1};
        System.out.println(minDifference(nums));
    }
    public static int minDifference(int[] nums) {
        if (nums.length<=4){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int min1 = nums[n-1]-nums[3];
        int min2 = nums[n-4]-nums[0];
        int min3 = nums[n-2]-nums[2];
        int min4 = nums[n-3]-nums[1];
        int c1 = Math.min(min1,min2);
        int c2= Math.min(min3,min4);
        return Math.min(c1,c2);

    }
}

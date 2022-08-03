package com.company;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        int[]  nums = {3,6,1,0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int max1 =Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max1Index =-1;
        for (int i = 0; i < nums.length; i++) {
            if (max1<nums[i]){
                max1 = nums[i];
                max1Index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i==max1Index){
                continue;
            }
            if (max2<nums[i]){
                max2 = nums[i];
            }
        }
        if (max1>=2*max2){
            return max1Index;
        }
        return -1;
    }
}

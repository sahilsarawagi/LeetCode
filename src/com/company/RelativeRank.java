package com.company;

import java.util.Arrays;

public class RelativeRank {
    public static void main(String[] args) {
        int[] score ={10,5,9,6,4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
    public static String[] findRelativeRanks(int[] nums) {
        Integer[] index = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }

        Arrays.sort(index, (a, b) -> (nums[b] - nums[a]));

        String[] ans = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ans[index[i]] = "Gold Medal";
            }
            else if (i == 1) {
                ans[index[i]] = "Silver Medal";
            }
            else if (i == 2) {
                ans[index[i]] = "Bronze Medal";
            }
            else {
                ans[index[i]] = (i + 1) + "";
            }
        }

        return ans;
    }

}

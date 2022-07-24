package com.company;

import java.util.Arrays;

public class MinimumMovesToEqualArrayElements2 {
    public static void main(String[] args) {
        int[] arr = {1,0,1};
        System.out.println(minMoves2(arr));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid= nums.length/2 ;
        int moves=0;
        for (int i = 0; i < nums.length; i++) {
            moves+= Math.abs(nums[i]-nums[mid]);
        }
        return moves;
    }
}

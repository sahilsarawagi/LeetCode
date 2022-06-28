
//https://leetcode.com/problems/single-number/

package com.company;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,8,6,9,9,8,6,7,4};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique = 0;
        for (int j : arr) unique ^= j;
        return unique;
    }


}

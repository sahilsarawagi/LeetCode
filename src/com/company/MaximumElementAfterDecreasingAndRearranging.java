package com.company;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging {
    public static void main(String[] args) {
        int[] arr = {100,1,1000};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i-1]-arr[i])>1){
                arr[i] = arr[i-1] + 1;
            }
        }
        return arr[arr.length-1];
}
}

package com.company;

import java.util.Arrays;

public class MaximumElementAfterDecreasingAndRearranging {
    public static void main(String[] args) {
        int[] arr = {4543};
        System.out.println(maximumElementAfterDecrementingAndRearranging(arr));
    }
    public static int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if (arr.length==1){
            return 1;
        }
        Arrays.sort(arr);
        int max =Integer.MIN_VALUE;
        int lastmax=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[0]!=1){
                arr[0]=1;
            }
            if (i>=1){
                if (Math.abs(arr[i-1]-arr[i])<=1){
                    max = arr[i];
                    if (lastmax>max){
                        int temp = lastmax;
                        lastmax=max;
                        max = temp;
                    }
                }else {
                    arr[i]= arr[i-1] + 1;
                    max= arr[i];
                    if (lastmax>max){
                        int temp = lastmax;
                        lastmax=max;
                        max = temp;}
            }

        }
    }
        return max;
}
}

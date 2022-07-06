package com.company;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] arr = {7, 6, 9, 3, 4, 8, 5, 20, 0, 5, 6, 3, 2, 1};

        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] sortArrayByParity(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        for (int i = 0, j = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0) {
                int temp = arr[j];
                arr[j++] = arr[i];
                arr[i] = temp;
            }
        return arr;
    }
}
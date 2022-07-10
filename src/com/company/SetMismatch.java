package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        List <Integer> li = new ArrayList<>();
        cyclicSort(arr);
        System.out.println(Arrays.toString(cyclicSort(arr)));




    }

    static int[] cyclicSort(int[] arr) {
        int[] ans = new int[2];
        int i=0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (arr[i]!=arr[correct]){
                swapp(arr,i,correct);
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j+1){
                ans = new int[]{arr[j], j + 1};
            }
        }
        return ans;
    }

    static void swapp(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}

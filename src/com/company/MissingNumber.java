package com.company;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/submissions/
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,2,6,0,7};
        int ans = cyclicSort(arr);
        System.out.println(ans);


    }

    static int cyclicSort(int[] arr) {
        int i=0;
        while (i< arr.length){

                int correct = arr[i];
                if (arr[i]< arr.length && arr[i]!=arr[correct]){
                    swapp(arr,i,correct);
                }
                else {
                    i++;
                }

            }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=j){
                return j;
            }
        }
            return arr.length;
    }

    static void swapp(int[] arr, int first , int second) {
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second]=temp;
    }
}

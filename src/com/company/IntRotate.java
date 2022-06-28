package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

public class IntRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] rot=Rotate(2, arr);
        System.out.println(Arrays.toString(rot));
    }

    private static int[] Rotate(int n, int[] arr) {
        n = n% arr.length;
        int end = arr.length-1;
        int start = 0;
        rever(arr,start,end);
        rever(arr,start,n-1);
        rever(arr,n,end);
        return arr;
    }

    private static int[] rever(int[] arr, int start, int end) {
        for (int i = 0; end> start; i++) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
        return arr;
    }


}

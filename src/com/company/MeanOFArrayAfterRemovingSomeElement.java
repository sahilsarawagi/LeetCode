package com.company;
//https://leetcode.com/submissions/detail/753823300/
import java.util.Arrays;

public class MeanOFArrayAfterRemovingSomeElement {
    public static void main(String[] args) {
        int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        System.out.println(trimMean(arr));
    }
    public static double trimMean(int[] arr) {
        double sum = 0;
        Arrays.sort(arr);
        int div = 9*arr.length/10;
        int  i = arr.length/20;
        while (i <(19*arr.length/20)){
            sum+= arr[i];
            i++;
        }
        sum = sum/div;
        return sum;
    }
}

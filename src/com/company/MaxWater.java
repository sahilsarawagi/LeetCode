package com.company;
//https://leetcode.com/problems/container-with-most-water/

public class MaxWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
       int ans = maxWater(arr);
        System.out.println(ans);
    }

    private static int maxWater(int[] arr) {
        int area =0;
        int max =Integer.MIN_VALUE;
        int h = 0;
        int leftBar =0;
        int rightBar = arr.length-1;
        while(rightBar>leftBar){
            if (arr[rightBar]>arr[leftBar]){
                h=arr[leftBar];
            }else {
                h= arr[rightBar];
            }
            area = h*(rightBar-leftBar);
            if (area>max){
                max=area;
            }
            if (arr[rightBar]>arr[leftBar]){
                leftBar++;
            }else {
                rightBar--;
            }

        }
        return max;
    }
}

package com.company;
// https://leetcode.com/problems/minimum-size-subarray-sum/
public class minimum_size_subarray {
    public static void main(String[] args) {
        int[] arr = {1,4,4};
        int ans =min_size_arr(arr,4);
        System.out.println(ans);
    }
   static int  min_size_arr(int[] arr,int target){
        int right =arr.length-1;
        int left =0;
        while (right>left){
            if (arr[left]>=target ||  arr[right]>=target){
                return 1;
            }
            if (arr[left]+arr[right]>=target){
                System.out.println(left+" "+right);
                return 2;
            }
               if (arr[left] >= arr[right]) {
                   right--;
               }else {
                   left++;
               }


       }
       return 0;
    }
}

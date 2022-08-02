package com.company;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {
    public static void main(String[] args) {
        int[] arr = {-4,-5,6,5,7};

        System.out.println(largestSumAfterKNegations(arr,4));
    }
    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        if (nums[0]<0){
            int i=0;
            while (k>0 && nums[i]<0 && i<nums.length-1){
                nums[i]=-nums[i];
                k--;
                i++;
            }
            Arrays.sort(nums);
            return maximizerSum(k,nums);
        }

        return maximizerSum(k,nums);

    }
    private static int sum(int[] arr) {
        int sum=0;
        int left = 0 ;
        int right = arr.length-1;
        while (left<=right){
            if (left==right){
                sum += arr[left] ;
            }
            else {sum+= arr[left]+arr[right];}
            left++;
            right--;
        }
        return  sum;
    }

    private static int maximizerSum(int k ,int[] nums) {
        if (k%2!=0){
            nums[0]= -nums[0];
        }
        return sum(nums);
    }
}

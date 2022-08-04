package com.company;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        System.out.println(Arrays.toString(twoSum(nums, -8)));
    }
    public static int[] twoSum(int[] arr,int target) {
        int[] ans = new int[2];
        int left = 0;
        int right = arr.length-1;
        int[] clonearr = arr.clone();
        Arrays.sort(arr);
        while (left<right){
            if (arr[left]+arr[right]==target){
                ans = new int[]{arr[left], arr[right]};
            }
            if (arr[left]+arr[right]>target){
                right--;
            }else {
                left++;
            }
        }
        int l = 0;
        int r = arr.length-1;
        while (true){
            if (clonearr[l]!=ans[0] && clonearr[r]!=ans[1]){
                l++;
                r--;
            }
            else if (clonearr[l]==ans[0] && clonearr[r]!=ans[1]){
                r--;
            }
            else if (clonearr[l]!=ans[0] && clonearr[r]==ans[1]){
                l++;
            }
            else {
                break;
            }

        }
        return new int[] {l,r};
    }
}
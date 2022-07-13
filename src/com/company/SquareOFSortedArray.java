package com.company;
// https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
import java.util.Arrays;

public class SquareOFSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortedSquares(arr)));

    }
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans =new int[n];
        int k = n-1, j = 0, i=n-1;
        while(i>=0){
            if (Math.abs(arr[j])>Math.abs(arr[k])){
                ans[i]= arr[j]*arr[j];
                j++;
            }
            else {
                ans[i] = arr[k]*arr[k];
                k--;
            }

            i--;
        }
        return ans;
    }
}

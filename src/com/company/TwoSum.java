package com.company;
// Not Solved, we have to use hash map
// solution is wrong because binary search take sorted array, and we are not able to provide it.
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4,7,8,8,6};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static int binarySearch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid= start +(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            }else if (target>arr[mid]){
                start=mid+1;
            }else return mid;


        }
        return -1;
    }
    private static int[] twoSum(int[] arr,int target) {
        int n =arr.length;
        if (n==2){
            return new int[] {0,1};
        }
        int l=0;
        int r=n-1;
        int[] clonearr = arr.clone();
        insertionSort(arr);
        int[] ans = new int[2];
        while (l<r){
            if (arr[l]+arr[r]<target){
                l++;
            }
            else if (arr[l]+arr[r]>target){
                r--;
            }
            else {
                int p,q;
                p=binarySearch(clonearr,arr[l]);
                q=binarySearch(clonearr,arr[r]);
                ans = new int[]{p, q};
                break;
            }
        }
        return ans;
    }
}

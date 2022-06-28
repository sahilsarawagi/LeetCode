package com.company;
//    https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int target = 2;
        int ans =search(nums,target);
        System.out.println(ans);

    }
        static int search ( int[] arr, int target){
        if (arr.length == 1){
            if (arr[0]==target){
                return 0;
            }else {
                return -1;
            }
        }
        int rotPoint=0;
            for (int i = 0; i <arr.length-1 ; i++) {
                if (arr[i]>arr[i+1]){
                    rotPoint =i;
                    break;
                }
            }
           int partOne=  binarySearch(0,rotPoint,arr,target);
            int partTwo = binarySearch(rotPoint+1,arr.length-1,arr,target);
            if (partOne!=-1 ){
                if (arr[partOne]==target){
                    return partOne;
                }
            }
       if (partTwo!=-1 ){
                if (arr[partTwo]==target){
                    return partTwo;
                }
            }
        return -1;
    }

    private static int binarySearch(int start, int end,int[] arr, int target) {
        for (int i = 0; start <= end; i++) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid]> target){
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }

}
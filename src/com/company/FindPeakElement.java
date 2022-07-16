package com.company;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,7};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while(l < r) {
            int m = l + (r - l) / 2;
            if(arr[m] < arr[m + 1]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}

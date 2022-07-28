package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arithmetic_Subarrays {
    public static void main(String[] args) {
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7};
        int[] r = {4,4,9,7,9,10};
        System.out.println(checkArithmeticSubarrays(nums,l,r));

    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> li = new ArrayList<>();
        for (int j = 0; j < l.length; j++) {
            int[] arr = Arrays.copyOfRange(nums,l[j],r[j]+1);
            Arrays.sort(arr);
            int d;
            for (int i = 1; i < arr.length-1; i++) {
                d = arr[1]- arr[0];
                if (arr[i + 1] - arr[i] != d){
                    li.add(false);
                    break;
                }
                else if (i==arr.length-2){
                    li.add(true);
                }
            }
        }

        return  li ;
    }
}

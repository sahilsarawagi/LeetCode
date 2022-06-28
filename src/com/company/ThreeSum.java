package com.company;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/3sum/
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
//        int[] arr = {-1,2,-1};
        System.out.println(threeSum(arr));
        List<List<Integer>> ans =threeSum(arr);
        if(ans.get(2)==ans.get(1)){
            System.out.println("yess");
        }else {
            System.out.println("no");
        }

    }

     static List<List<Integer>> threeSum(int[] arr) {
        int sum = 1;
        int i= 0;
         List<List<Integer>> li = new ArrayList<>();
         if (arr.length<3 ){
             return li;
         }
             for (int j = 1; j < arr.length-1 ; j++) {
                 for (int k = 2; k < arr.length  ; k++) {
                     sum = arr[0]+arr[j]+arr[k];
                     if(sum==0){
                         System.out.println(arr[0] + ", " + arr[j] + ", "+ arr[k]);
                         li.add(new ArrayList<Integer>());
                         li.get(i).add(arr[0]);
                         li.get(i).add(arr[j]);
                         li.get(i).add(arr[k]);
                         i++;
                     }
                 }
             }
         return li;
    }
}

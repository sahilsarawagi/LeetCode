package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i]-arr[i+1])<min){
                min = Math.abs(arr[i]-arr[i+1]);
            }

        }
        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i]-arr[i+1])==min){
                ArrayList<Integer> newlist = new ArrayList<>();
                newlist.add(arr[i]);
                newlist.add(arr[i+1]);
                li.add(newlist);
            }
        }
        return li;
    }
}

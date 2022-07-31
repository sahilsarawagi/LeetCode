package com.company;


import java.util.Arrays;

public class MaximumUnitsOnATruck {
    public static void main(String[] args) {
        int arr[][] = {{1,3},{5,5},{2,5},{4,2},{4,1},{3,1},{2,2},{1,3},{2,5},{3,2}};
        System.out.println(maximumUnits(arr,35));
    }
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int maxUnit =0;
        int k = 0;
        for (int[] boxType : boxTypes) {
            for (int i : boxType) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        while (truckSize>0){
            maxUnit +=  boxTypes[k][0] * boxTypes[k][1];

            truckSize = truckSize - boxTypes[k][0];
            if (truckSize<0){
                maxUnit += truckSize* boxTypes[k][1];
            }
            k++;
            if (k>(boxTypes.length-1)){
                return maxUnit;
            }

        }
        return maxUnit;
    }}

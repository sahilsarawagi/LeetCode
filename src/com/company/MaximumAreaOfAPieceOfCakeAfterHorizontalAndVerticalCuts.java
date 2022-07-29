package com.company;
import java.util.Arrays;

public class MaximumAreaOfAPieceOfCakeAfterHorizontalAndVerticalCuts {
    public static void main(String[] args) {
       int h = 1000000000; int w = 1000000000;
       int[] horizontalCuts = {2};
       int[] verticalCuts = {2};
        System.out.println(maxArea(h,w,horizontalCuts,verticalCuts));
    }
    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
       int x =  maxValue(horizontalCuts,h);
       int y = maxValue(verticalCuts,w);
       return (int) ( (long) x*y % 1000000007);

    }

    private static int maxValue(int[] Points, int lastpoint) {
        int max = Points[0];
        for (int i = 0; i < Points.length-1; i++) {
            if (Points[i+1]-Points[i] >max){
                max =Points[i+1]-Points[i];
            }
        }
        if (lastpoint - Points[Points.length-1] > max){
            max = lastpoint - Points[Points.length-1];
        }
        return max;
    }


}

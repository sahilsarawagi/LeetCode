package com.company;
//https://leetcode.com/problems/check-if-it-is-a-straight-line/
public class StraightLine {
    public static void main(String[] args) {
//        int[][] arr = {{0,0},{0,1},{0,-1}};
        int[][] arr = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
       boolean ans= isStraight(arr);
        System.out.println(ans);
    }

    private static boolean isStraight(int[][] arr) {
        int y_dif =(arr[1][1]-arr[0][1]);
        int x_dif =(arr[1][0]-arr[0][0]);
        for (int i = 1; i < arr.length-1; i++) {
            int next_y_dif =(arr[i+1][1]-arr[i][1]);
            int next_x_dif =(arr[i+1][0]-arr[i][0]);
            if (next_x_dif*y_dif!=next_y_dif*x_dif){
                return false;
            }
        }
        return true;
    }
}

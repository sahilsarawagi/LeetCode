package com.company;
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/submissions/
public class NumOfStep {
    public static void main(String[] args) {
        int ans = numOfStep(14);
        System.out.println(ans);
    }

    private static int numOfStep(int n) {
        return helping(n,0);
    }

    private static int helping(int n, int c) {
        if (n==0){
            return c;
        }
        if (n%2==0){
            return helping(n/2,c+1);
        }
        return helping(n-1,c+1);

    }
}

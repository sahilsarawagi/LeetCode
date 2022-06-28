package com.company;
//https://leetcode.com/problems/happy-number/submissions/
public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(9));
    }

    static boolean isHappy(int n){
        if (check(n)==1) {
            return true;
        }else {
            return false;
        }
    }
    static int check(int hap){
        if (hap == 1 || hap ==7){
            return 1;
        }
        if (hap<10){
            return -1;
        }
        int sum = 0;
        int rem =0;
        while(hap>0){
            rem = hap%10;
            sum= rem * rem +sum;
            hap=hap/10;
        }

        return check(sum);
    }

}

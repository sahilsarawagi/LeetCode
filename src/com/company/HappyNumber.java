package com.company;
//https://leetcode.com/problems/happy-number/submissions/
public class HappyNumber {
    public static void main(String[] args) {

        System.out.println(isHappy(2));
    }

    static boolean isHappy(int n){
        if (check(n)==1) {
            return true;
        }else {
            return false;
        }
    }
    static int check(int beu){
        if (beu == 1 || beu ==7){
            return 1;
        }
        if (beu<10){
            return -1;
        }
        int sum = 0;
        int rem =0;
        while(beu>0){
            rem = beu%10;
            sum= rem * rem +sum;
            beu=beu/10;
        }

        return check(sum);
    }

}

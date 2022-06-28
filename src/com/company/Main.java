// https://leetcode.com/problems/palindrome-number/

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean bb=isPalindrone(a);
        System.out.println(bb);

    }

    private static boolean isPalindrone(int a) {
        int rem = 0;
        int rev=0;
        int original =a;
        while(a>0){
            rem =a%10;
            rev = rem  +rev*10;
            a = a/10;
        }
        if (original-rev==0){
            return true;
        }
        return false;
    }
}

// https://leetcode.com/problems/palindrome-number/

package com.company;
import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int bb=reverseInt(a);
        System.out.println(bb);

    }

    private static int reverseInt(int a) {
            int neg =1;
            if (a<0){
                a=a*(-1);
                neg=-1;
            }
            int rem = 0;
            long rev=0;
            int original =a;
            while(a>0){
                rem =a%10;
                rev = rem  +rev*10;
                a = a/10;
            }
            rev = rev * neg;
            if (rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
            return (int) rev;

    }
}

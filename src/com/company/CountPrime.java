package com.company;
//https://leetcode.com/problems/count-primes/
import java.util.Arrays;

public class CountPrime {
    public static void main(String[] args) {
       int ans= countPrimes(12);
        System.out.println(ans);
    }
    public static int countPrimes(int n) {
        boolean[] arr = new boolean[n+1];
        for (int i = 2; i*i < n; i++) {
            int k = 2;
            if (arr[i]){
                continue;
            }
            while (k<=n/i){
                arr[k*i]=true;
                k++;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!arr[i]){
                count++;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);
        return count;
    }
}

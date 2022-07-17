package com.company;

public class LargeNumber {
    public static void main(String[] args) {
    System.out.println(largeNumber(9799));
}

    private static int largeNumber(int n) {
        StringBuilder num  = new StringBuilder(String.valueOf(n));
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i)=='7'){
                num.setCharAt(i,'9');
                break;
            }
        }
        return Integer.parseInt(String.valueOf(num));
    }
}


package com.company;
// https://leetcode.com/problems/find-the-difference/
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("","p"));
    }
    public  static char findTheDifference(String s, String t) {
        int n = 0;
        int r = s.length();
        int l = t.length()-1;
        for (int i = 0; i < s.length(); i++) {
            n^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            n^=t.charAt(i);
        }
        return (char) n;
    }
}

package com.company;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t ="nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        return bubbleSort(s).equals(bubbleSort(t));
    }

    static String bubbleSort(String s){
        char arr[] = s.toCharArray();
        char temp;
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }   return new String(arr);
    }
}

package com.company;
//https://leetcode.com/problems/rearrange-words-in-a-sentence/submissions/

public class RearrangeWordsInSentence {
    public static void main(String[] args) {
        String numbers = "Keep calm and code on";
        System.out.println(arrangeWords(numbers));
    }
    static void swap(String[] arr,int first,int second){
        String temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static void insertionSort(String[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j].length()<arr[j-1].length()){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    public static String arrangeWords(String text) {
        String[] tokens = text.split(" ");
        String[] ary = new String[tokens.length];

        int i = 0;
        for (String token : tokens){
            ary[i++] = token.toLowerCase();
        }
        insertionSort(ary);
        StringBuffer sb = new StringBuffer();
        for(int l = 0; l < ary.length; l++) {
            if (l==0){
                sb.append(ary[l].substring(0,1).toUpperCase()+ary[l].substring(1) + " ");
            }
            else if (l==ary.length-1){
                sb.append(ary[l]);
            }
            else {
                sb.append(ary[l] + " ");
            }
        }
        return sb.toString();
    }
}


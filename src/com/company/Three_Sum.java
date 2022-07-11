package com.company;
//https://leetcode.com/problems/3sum/discuss/561981/JavaPython-Sort-then-Two-Pointers-Clean-and-Concise
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};


        System.out.println(threeSum(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    public static List<List<Integer>> threeSum(int[] arr) {
        insertionSort(arr);
        List<List<Integer>> li = new ArrayList<>();
        if (arr.length<3 ){
            return li;
        }
        int n= arr.length,f=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>0){
                break;
            }
            int l = i+1 , r= n-1;
            while (r>l){
                if ((arr[i]+arr[l]+arr[r])>0){
                    r--;
                }
                else if ((arr[i]+arr[l]+arr[r])<0){
                    l++;
                }
                else {
                    li.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    while (l+1 <= r && arr[l] == arr[l+1]) l++;
                    l++;
                    r--;
                }
            }
            while (i+1 < n && arr[i+1] == arr[i]) i++;
        }
        return li;
    }
}

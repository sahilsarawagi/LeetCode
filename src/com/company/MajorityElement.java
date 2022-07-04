package com.company;

public class MajorityElement {
    public static void main(String[] args) {
        int[] num ={1,1,5,5,4,6,7,5,5,5};
     int ans=majorityElement(num);
        System.out.println(ans);

    }
    public static int majorityElement(int[] num) {
        int majority=num[0];
        int count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                majority=num[i];
            }else if(majority==num[i]){
                count++;
            }else count--;

        }
        return majority;
    }
}

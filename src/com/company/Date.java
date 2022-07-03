package com.company;

import java.time.Year;

public class Date {
    public static void main(String[] args) {
       String and =reformatDate("8st Dec 2008");
        System.out.println(and);

    }
    public static String reformatDate(String date) {
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String month ="Jan";
        String year = "5656";
        if (date.charAt(4)==' '){
            String num = Character.toString(date.charAt(0)) +Character.toString(date.charAt(1));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(Character.toString(date.charAt(5))+Character.toString(date.charAt(6))+Character.toString(date.charAt(7)))){
                    if (i<9){
                        month = "0" + String.valueOf(i+1);
                    }
                    else {
                        month = String.valueOf(i+1);
                    }
                }

            }
             year = Character.toString(date.charAt(9)) + Character.toString(date.charAt(10))+Character.toString(date.charAt(11))+Character.toString(date.charAt(12));

            return year + "-" + month+ "-" + num ;

        }
            String num = Character.toString(date.charAt(0));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(Character.toString(date.charAt(4)) + Character.toString(date.charAt(5)) + Character.toString(date.charAt(6)))) {
                    if (i<9){
                        month = "0" + String.valueOf(i+1);
                    }
                    else {
                        month = String.valueOf(i+1);
                    }
                }
            }
             year =Character.toString(date.charAt(8))+ Character.toString(date.charAt(9)) + Character.toString(date.charAt(10))+Character.toString(date.charAt(11));

        return year + "-" + month+ "-" + "0"+num ;

}
}

package com.bootcoding.Practice;

public class CountNums {
    public static void main(String[] args) {
        int n = 2345433;

        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem==3){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

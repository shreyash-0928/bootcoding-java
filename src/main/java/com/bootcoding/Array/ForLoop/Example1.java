package com.bootcoding.Array.ForLoop;

public class Example1 {
    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = i*2;
            System.out.println(a[i]);
        }
    }

}

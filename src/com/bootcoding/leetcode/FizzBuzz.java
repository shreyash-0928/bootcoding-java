package com.bootcoding.leetcode;

import java.util.ArrayList;
import java.util.List;

// public List<String> fizzBuzz(int n) {
class Solution{
    public List<String> fizzBuzz(int n){

        List<String> a = new ArrayList();
        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                a.add("FizzBuzz");
            }else if(i%5 == 0){
                a.add("Buzz");
            }else if (i%3 == 0){
                a.add("Fizz");
            }else{
                a.add(""+i);
            }
        }
        return a;
    }

}

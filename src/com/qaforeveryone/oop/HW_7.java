package com.qaforeveryone.oop;

import java.util.Arrays;

public class HW_7 {

    public static void main(String[] args) {

        /**
         *
         */

        int n = 10;
        int numOdd = 0;

        int[] arr1 = new int[n];
        int[] arrOdd;
        int[] arrEven;

        for(int i = 0; i < n; i++) {
            arr1[i] = Math.abs((int) (Math.random() * Integer.MAX_VALUE));
            if(arr1[i] % 2 != 0) numOdd++;
            //Math.abs((int) (Math.random() * Integer.MAX_VALUE) * 100);
        }

        System.out.println(numOdd + "  " + Arrays.toString(arr1));
        arrOdd


    }


}

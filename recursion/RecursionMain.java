package com.company.recursion;

import com.company.recursion.level1.RecursionLevel1;
import com.company.recursion.level1.RecursionLevel1Impl;

import java.util.Arrays;

public class RecursionMain {

    public static void main(String[] args) {

        var arr = new int[]{1, 2, 3, 4, 5, 6};
        var arr1 = new int[]{1, 2, 3, 4, 6};

        var rL1 = new RecursionLevel1Impl();

        System.out.println(Arrays.toString(arr));
        rL1.reverseArray(arr);
        System.out.println(Arrays.toString(arr));

//        System.out.println(rL1.isSorted(arr, 0));
//        System.out.println(rL1.isSorted(arr1, 0));


    }

}

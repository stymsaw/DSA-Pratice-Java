package com.company.recursion;

import com.company.recursion.level1.ArrayRecursion;

public class RecursionMain {

    public static void main1(String[] args) {

        var rL1 = new ArrayRecursion();
        var arr = new int[]{1, 2, 3, 4, 5, 6};

        boolean search = rL1.linearSearch(arr, 5);
        int i = rL1.firstOccurrence(arr, 55);
        rL1.reverseArray(arr);

        System.out.println(rL1.lastOccurrence(arr, 1));

    }

    public static void main(String[] args) {

        var rL1 = new ArrayRecursion();
        var arr = new int[]{1, 2, 3, 4, 5, 6, 1};



    }

}

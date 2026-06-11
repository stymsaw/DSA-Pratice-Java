package com.company.recursion.level1;

public class RecursionLevel1Impl extends RecursionLevel1 {


    @Override
    public boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    public void reverseArray(int[] arr) {
        reverseArray(arr, 0, arr.length - 1);
    }

    public void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        swapNumbers(arr, start, end);
        reverseArray(arr, start + 1, end - 1);
    }

    private static void swapNumbers(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}

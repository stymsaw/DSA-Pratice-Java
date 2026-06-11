package recursion.level1.impl;

import recursion.level1.ArrayRecursion;

public class ArrayRecursionImpl extends ArrayRecursion {

    @Override
    public void reverseArray(int[] arr) {
        reverseArray(arr, 0, arr.length - 1);
    }

    private void reverseArray(int[] arr, int start, int end) {
        if (start >= end) return;
        swap(arr, start, end);
        reverseArray(arr, start + 1, end - 1);
    }

    @Override
    public boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    private boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    @Override
    public boolean linearSearch(int[] arr, int target) {
        return linearSearch(arr, target, 0);
    }

    private boolean linearSearch(int[] arr, int target, int index) {
        if (index > arr.length - 1) return false;
        if (arr[index] == target) return true;
        return linearSearch(arr, target, index + 1);
    }

    @Override
    public int firstOccurrence(int[] arr, int target) {
        return firstOccurrence(arr, target, 0);
    }

    private int firstOccurrence(int[] arr, int target, int index) {
        if (index > arr.length - 1) return -1;
        if (arr[index] == target) return index;
        return firstOccurrence(arr, target, index + 1);
    }

    @Override
    public int lastOccurrence(int[] arr, int target) {
        return lastOccurrence(arr, target, 0, -1);
    }

    private int lastOccurrence(int[] arr, int target, int index, int lastSeen) {
        if (index > arr.length - 1) return lastSeen;
        if (arr[index] == target) lastSeen = index;
        return lastOccurrence(arr, target, index + 1, lastSeen);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

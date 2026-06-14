package arrays.level1.basics.impl;

import arrays.level1.basics.Traversal;

import java.util.Arrays;

public class TraversalImpl extends Traversal {

    public static void main(String[] args) {

        TraversalImpl traversal = new TraversalImpl();

        int[] arr = {2, 234, 234, 123, 1523, 5324, 234, 23};

//        System.out.println(traversal.findMax(arr));

//        System.out.println(traversal.secondLargest(arr));
        System.out.println(Arrays.toString(traversal.minAndMax(arr)));


    }

    @Override
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    @Override
    public int secondLargest(int[] arr) {

        int firstMax = arr[0];
        int secondMax = arr[1];

        for (int current : arr)
            if (current > firstMax) {
                secondMax = firstMax;
                firstMax = current;
            }

        return secondMax;

    }

    @Override
    public int[] minAndMax(int[] arr) {

        int min = arr[0];
        int max = arr[1];

        for (int current : arr) {
            if (current > max) max = current;
            if (current < min) min = current;
        }

        return new int[]{min, max};

    }

}

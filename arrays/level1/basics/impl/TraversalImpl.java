package arrays.level1.basics.impl;

import arrays.level1.basics.Traversal;

public class TraversalImpl extends Traversal {

    public static void main(String[] args) {

        TraversalImpl traversal = new TraversalImpl();

        int[] arr = {2, 234, 234, 123, 523, 5324, 234, 23};

        System.out.println(traversal.findMax(arr));


    }

    @Override
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    @Override
    public int secondLargest(int[] arr) {
        // TODO [A02] Second largest DISTINCT value, or -1.
        throw new UnsupportedOperationException("TODO: secondLargest");
    }

    @Override
    public int[] minAndMax(int[] arr) {
        // TODO [A03] Return {min, max} in a single pass.
        throw new UnsupportedOperationException("TODO: minAndMax");
    }

}

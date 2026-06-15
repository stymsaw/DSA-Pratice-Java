package arrays.level1.basics.impl;

import arrays.level1.basics.Rearrange;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeImpl extends Rearrange {

    public static void main(String[] args) {

        RearrangeImpl rearrange = new RearrangeImpl();
        int[] arr = new int[]{0, 1, 0, 3, 12};

        rearrange.moveZeros(arr);
        System.out.println(Arrays.toString(arr));

    }

    @Override
    public void reverse(int[] arr) {
        // TODO [A04] Reverse the array in-place.
        throw new UnsupportedOperationException("TODO: reverse");
    }

    @Override
    public void moveZeros(int[] arr) {
//        int insertPos = 0;
//        for (int i = 0; i < arr.length; i++) if (arr[i] != 0) arr[insertPos++] = arr[i];
//        while (insertPos < arr.length) arr[insertPos++] = 0;
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
    }

    private void swapItems(int[] arr, int idx1, int idx2) {
        var printLine = "idx1: " + idx1 + " idx2: " + idx2;
        System.out.println(printLine);
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    @Override
    public void rotateByK(int[] arr, int k) {
        // TODO [A06] Rotate right by k (reversal trick, O(1) space).
        throw new UnsupportedOperationException("TODO: rotateByK");
    }

}

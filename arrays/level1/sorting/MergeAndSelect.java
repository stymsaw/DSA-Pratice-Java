package arrays.level1.sorting;

public abstract class MergeAndSelect {

    /*
     * Variant: Merge / selection based - merge-sort pairing and quickselect partitioning.
     * [F07] mergeSortedArrays  ☐
     * [F08] kthLargest        ☐
     * [F09] countInversions   ☐
     */

    public abstract int[] mergeSortedArrays(int[] a, int[] b);

    public abstract int kthLargest(int[] arr, int k);

    public abstract long countInversions(int[] arr);

}

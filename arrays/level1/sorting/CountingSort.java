package arrays.level1.sorting;

public abstract class CountingSort {

    /*
     * Variant: Counting / bucket sort - exploit bounded value ranges for linear-time order.
     * [F04] sortColors   ☐
     * [F05] topKFrequent  ☐
     * [F06] maximumGap   ☐
     */

    public abstract void sortColors(int[] arr);

    public abstract int[] topKFrequent(int[] arr, int k);

    public abstract int maximumGap(int[] arr);

}

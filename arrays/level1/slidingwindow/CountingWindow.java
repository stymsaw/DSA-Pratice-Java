package arrays.level1.slidingwindow;

public abstract class CountingWindow {

    /*
     * Variant: Counting windows (atMost(K) - atMost(K-1)) - count subarrays meeting an exact condition.
     * [C07] subarraysWithKDistinct  ☐
     * [C08] countNiceSubarrays     ☐
     */

    public abstract int subarraysWithKDistinct(int[] arr, int k);

    public abstract int countNiceSubarrays(int[] arr, int k);

}

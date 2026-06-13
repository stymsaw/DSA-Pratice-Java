package arrays.level1.monotonicdeque;

public abstract class WindowExtreme {

    /*
     * Variant: Window max/min - monotonic deque of indices gives O(1) amortized window extremes.
     * [L01] maxSlidingWindow            ☐
     * [L02] minSlidingWindow            ☐
     * [L03] shortestSubarraySumAtLeastK  ☐
     */

    public abstract int[] maxSlidingWindow(int[] arr, int k);

    public abstract int[] minSlidingWindow(int[] arr, int k);

    public abstract int shortestSubarraySumAtLeastK(int[] arr, int k);

}

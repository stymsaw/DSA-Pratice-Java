package arrays.level1.slidingwindow;

public abstract class FixedWindow {

    /*
     * Variant: Fixed-size window - window width k is constant; slide by one each step.
     * [C01] maxSumSubarrayK         ☐
     * [C02] firstNegativeEachWindow  ☐
     * [C03] maxAverageSubarrayK     ☐
     */

    public abstract int maxSumSubarrayK(int[] arr, int k);

    public abstract int[] firstNegativeEachWindow(int[] arr, int k);

    public abstract double maxAverageSubarrayK(int[] arr, int k);

}

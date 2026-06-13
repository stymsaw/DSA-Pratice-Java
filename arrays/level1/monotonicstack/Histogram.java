package arrays.level1.monotonicstack;

public abstract class Histogram {

    /*
     * Variant: Histogram / spans - monotonic stack to bound widths under a height.
     * [K04] largestRectangleArea  ☐
     * [K05] trapRainWater        ☐
     * [K06] sumSubarrayMins      ☐
     */

    public abstract int largestRectangleArea(int[] heights);

    public abstract int trapRainWater(int[] height);

    public abstract int sumSubarrayMins(int[] arr);

}

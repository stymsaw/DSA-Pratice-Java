package arrays.level1.monotonicstack;

public abstract class NearestElement {

    /*
     * Variant: Nearest greater/smaller - keep a monotonic stack of indices to find spans in O(n).
     * [K01] nextGreaterElements  ☐
     * [K02] dailyTemperatures   ☐
     * [K03] previousSmaller     ☐
     */

    public abstract int[] nextGreaterElements(int[] arr);

    public abstract int[] dailyTemperatures(int[] temps);

    public abstract int[] previousSmaller(int[] arr);

}

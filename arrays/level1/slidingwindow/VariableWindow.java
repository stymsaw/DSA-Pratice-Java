package arrays.level1.slidingwindow;

public abstract class VariableWindow {

    /*
     * Variant: Variable-size window - grow/shrink to satisfy a constraint (longest/shortest).
     * [C04] longestUniqueSubstring  ☐
     * [C05] minSubarrayLenAtLeast  ☐
     * [C06] longestOnesWithKFlips  ☐
     */

    public abstract int longestUniqueSubstring(String s);

    public abstract int minSubarrayLenAtLeast(int[] arr, int target);

    public abstract int longestOnesWithKFlips(int[] arr, int k);

}

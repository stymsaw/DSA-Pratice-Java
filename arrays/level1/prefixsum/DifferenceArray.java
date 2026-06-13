package arrays.level1.prefixsum;

public abstract class DifferenceArray {

    /*
     * Variant: Difference array - O(1) range updates, prefix at the end to materialize.
     * [D06] applyRangeUpdates  ☐
     * [D07] maxBookedAtOnce   ☐
     */

    public abstract int[] applyRangeUpdates(int n, int[][] updates);

    public abstract int maxBookedAtOnce(int[][] bookings, int n);

}

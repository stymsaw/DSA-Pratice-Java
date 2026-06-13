package arrays.level1.bitmath;

import java.util.List;

public abstract class BitmaskMath {

    /*
     * Variant: Bitmask & math - subsets via masks, greedy bit-by-bit construction.
     * [J07] subsets    ☐
     * [J08] maximumXor  ☐
     */

    public abstract List<List<Integer>> subsets(int[] arr);

    public abstract int maximumXor(int[] arr);

}

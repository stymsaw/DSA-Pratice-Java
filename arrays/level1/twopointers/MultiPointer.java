package arrays.level1.twopointers;

import java.util.List;

public abstract class MultiPointer {

    /*
     * Variant: Multi-pointer / k-Sum - sort then fix one index and converge the rest.
     * [B07] threeSumZero    ☐
     * [B08] threeSumClosest  ☐
     */

    public abstract List<int[]> threeSumZero(int[] arr);

    public abstract int threeSumClosest(int[] arr, int target);

}

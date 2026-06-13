package arrays.level1.prefixsum;

public abstract class TwoD {

    /*
     * Variant: 2D prefix sum - integral image for O(1) submatrix sums.
     * [D04] matrixRangeSum            ☐
     * [D05] countSubmatricesSumTarget  ☐
     */

    public abstract int matrixRangeSum(int[][] m, int r1, int c1, int r2, int c2);

    public abstract int countSubmatricesSumTarget(int[][] m, int target);

}

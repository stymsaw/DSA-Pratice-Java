package arrays.level1.matrix;

import java.util.List;

public abstract class Traversal {

    /*
     * Variant: Matrix traversal - non-row-major orders (spiral, diagonal, boundary).
     * [I01] spiralOrder       ☐
     * [I02] diagonalOrder     ☐
     * [I03] boundaryTraversal  ☐
     */

    public abstract List<Integer> spiralOrder(int[][] m);

    public abstract List<Integer> diagonalOrder(int[][] m);

    public abstract List<Integer> boundaryTraversal(int[][] m);

}

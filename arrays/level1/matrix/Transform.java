package arrays.level1.matrix;

public abstract class Transform {

    /*
     * Variant: In-place transforms - rotate, transpose, and marker-based mutation.
     * [I04] transpose  ☐
     * [I05] rotate90  ☐
     * [I06] setZeroes  ☐
     */

    public abstract int[][] transpose(int[][] m);

    public abstract void rotate90(int[][] m);

    public abstract void setZeroes(int[][] m);

}

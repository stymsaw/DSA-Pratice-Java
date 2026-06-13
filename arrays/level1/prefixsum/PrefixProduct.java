package arrays.level1.prefixsum;

public abstract class PrefixProduct {

    /*
     * Variant: Prefix / suffix products - combine left and right running products (no division).
     * [D10] productExceptSelf     ☐
     * [D11] maxLenPositiveProduct  ☐
     */

    public abstract int[] productExceptSelf(int[] arr);

    public abstract int maxLenPositiveProduct(int[] arr);

}

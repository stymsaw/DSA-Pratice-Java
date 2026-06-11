package recursion.level1;

public abstract class ArrayRecursion {

    /*
     * Array Recursion
     * [R14] Reverse Array               ✅
     * [R15] Is Sorted                   ✅
     * [R16] Linear Search               ✅
     * [R17] First Occurrence            ✅
     * [R18] Last Occurrence             ✅
     */

    public abstract void reverseArray(int[] arr);

    public abstract boolean isSorted(int[] arr);

    public abstract boolean linearSearch(int[] arr, int target);

    public abstract int firstOccurrence(int[] arr, int target);

    public abstract int lastOccurrence(int[] arr, int target);
}

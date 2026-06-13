package arrays.level1.hashing;

public abstract class SetMembership {

    /*
     * Variant: Set membership / index map - O(1) lookups for existence or complement.
     * [G04] twoSum                  ☐
     * [G05] containsNearbyDuplicate  ☐
     * [G06] longestConsecutive      ☐
     */

    public abstract int[] twoSum(int[] arr, int target);

    public abstract boolean containsNearbyDuplicate(int[] arr, int k);

    public abstract int longestConsecutive(int[] arr);

}

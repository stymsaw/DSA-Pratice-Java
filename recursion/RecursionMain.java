package recursion;


import recursion.level1.ArrayRecursion;

public class RecursionMain {

    public static void main1(String[] args) {

        var rL1 = new ArrayRecursion();
        var arr = new int[]{1, 2, 3, 4, 5, 6};

        rL1.reverseArray(arr);
        System.out.println(rL1.isSorted(arr));
        System.out.println(rL1.linearSearch(arr, 1));
        System.out.println(rL1.firstOccurrence(arr, 1));
        System.out.println(rL1.lastOccurrence(arr, 1));

        System.out.println(rL1.sumOfFirstNNumbers(10));
        System.out.println(rL1.sumOfArray(arr));
        System.out.println(rL1.factorialParameterized(4));
        System.out.println(rL1.countDigits(12));
        System.out.println(rL1.sumOfDigits(1122));

    }

    public static void main(String[] args) {

        var rL1 = new ArrayRecursion();
        var arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


    }

}

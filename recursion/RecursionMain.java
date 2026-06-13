package recursion;

import recursion.level1.impl.ArrayRecursionImpl;
import recursion.level1.impl.FunctionalRecursionImpl;
import recursion.level1.impl.MathRecursionImpl;
import recursion.level1.impl.StringRecursionImpl;

public class RecursionMain {

    public static void main(String[] args) {

        var arr = new ArrayRecursionImpl();
        var math = new MathRecursionImpl();
        var str = new StringRecursionImpl();
        var funRec = new FunctionalRecursionImpl();

        int[] nums = {1, 2, 3, 4, 55, 6, 7, 8, 9, 10};

        // array recursion
//        arr.reverseArray(nums);
//        System.out.println(arr.isSorted(nums));
//        System.out.println(arr.linearSearch(nums, 1));
//        System.out.println(arr.firstOccurrence(nums, 1));
//        System.out.println(arr.lastOccurrence(nums, 1));

        // math recursion
//        System.out.println(math.sumOfFirstNNumbers(10));
//        System.out.println(math.sumOfArray(nums));
//        System.out.println(math.factorialParameterized(4));
//        System.out.println(math.countDigits(12));
//        System.out.println(math.sumOfDigits(1122));

        // string recursion
//        System.out.println(str.isPalindrome("abc"));

        // function recursion
//        System.out.println(funRec.factorial(11));

//        System.out.println(funRec.power(3,3));

//        System.out.println(funRec.fibonacci(6));

//        System.out.println(funRec.findMax(nums));

        System.out.println(str.reverseString("sdag"));

    }
}

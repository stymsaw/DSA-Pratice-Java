package com.company.recursion.level1;

public abstract class RecursionLevel1 {

    /*
     * Level 1 Progress Tracker
     *
     * Basic Recursion
     * [R01] Print N To 1                ⏳
     * [R02] Print 1 To N Backtracking   ⏳
     * [R03] Print N To 1 Backtracking   ⏳
     * [R04] Print Name N Times          ⏳
     *
     * Recursive Mathematics
     * [R05] Sum Of First N Numbers      ⏳
     * [R06] Sum Of Array                ⏳
     * [R07] Factorial (Parameterized)   ⏳
     * [R08] Count Digits                ⏳
     * [R09] Sum Of Digits               ⏳
     *
     * Functional Recursion
     * [R10] Factorial                   ⏳
     * [R11] Fibonacci                   ⏳
     * [R12] Power                       ⏳
     * [R13] Find Max                    ⏳
     *
     * Array Recursion
     * [R14] Reverse Array               ✅
     * [R15] Is Sorted                   ✅
     * [R16] Linear Search               ⏳
     * [R17] First Occurrence            ✅
     * [R18] Last Occurrence             ⏳
     *
     * String Recursion
     * [R19] Is Palindrome               ⏳
     * [R20] Reverse String              ⏳
     * [R21] Remove Character            ⏳
     * [R22] Replace Pi                  ⏳
     * [R23] Remove Consecutive Dups     ⏳
     */

    // A. Basic Recursion

//    abstract public void print1ToN(int n);

//    public abstract void printNTo1(int n);

//    public abstract void print1ToNBacktracking(int n);

//    public abstract void printNTo1Backtracking(int n);

//    public abstract void printNameNTimes(String name, int n);


    // B. Recursive Mathematics

//    public abstract int sumOfFirstNNumbers(int n);

//    public abstract int sumOfArray(int[] arr);

//    public abstract int factorialParameterized(int n);

//    public abstract int countDigits(int number);

//    public abstract int sumOfDigits(int number);


    // C. Functional Recursion

//    public abstract int factorial(int n);

//    public abstract int fibonacci(int n);

//    public abstract long power(int x, int n);

//    public abstract int findMax(int[] arr);


    // D. Array Recursion

    public abstract void reverseArray(int[] arr);

    public abstract boolean isSorted(int[] arr, int index);

    public abstract boolean linearSearch(int[] arr, int target);

    public abstract int firstOccurrence(int[] arr, int target);

    public abstract int lastOccurrence(int[] arr, int target);


    // E. String Recursion

//    public abstract boolean isPalindrome(String s);

//    public abstract String reverseString(String s);

//    public abstract String removeCharacter(String s, char ch);

//    public abstract String replacePi(String s);

//    public abstract String removeConsecutiveDuplicates(String s);
}

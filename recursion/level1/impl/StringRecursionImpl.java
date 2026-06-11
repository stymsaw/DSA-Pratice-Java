package recursion.level1.impl;

import recursion.level1.StringRecursion;

public class StringRecursionImpl extends StringRecursion {

    @Override
    public boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private boolean isPalindrome(String string, int start, int end) {
        if (start >= end) return false;
        if (string.charAt(start) == string.charAt(end)) return true;
        return isPalindrome(string, start + 1, end - 1);
    }


    @Override
    public String reverseString(String s) {
        return ""; // TODO
    }

    @Override
    public String removeCharacter(String s, char ch) {
        return ""; // TODO
    }

    @Override
    public String replacePi(String s) {
        return ""; // TODO
    }

    @Override
    public String removeConsecutiveDuplicates(String s) {
        return ""; // TODO
    }
}

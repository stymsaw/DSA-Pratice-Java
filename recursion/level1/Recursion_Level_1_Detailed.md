# Recursion Level 1 (Foundation)

This roadmap covers the most important beginner recursion problems. Complete them in order.

---

## A. Basic Recursion

### 1. Print Numbers from 1 to N
**Problem:** Given an integer `N`, print all numbers from `1` to `N` using recursion.

**Example**
```
Input: N = 5
Output: 1 2 3 4 5
```

---

### 2. Print Numbers from N to 1
**Problem:** Given an integer `N`, print all numbers from `N` down to `1` using recursion.

**Example**
```
Input: N = 5
Output: 5 4 3 2 1
```

---

### 3. Print 1 to N Using Backtracking
**Problem:** Print numbers from `1` to `N` without directly printing in increasing order. Use recursion and backtracking.

**Example**
```
Input: N = 5
Output: 1 2 3 4 5
```

---

### 4. Print N to 1 Using Backtracking
**Problem:** Print numbers from `N` to `1` using recursion and backtracking.

**Example**
```
Input: N = 5
Output: 5 4 3 2 1
```

---

### 5. Print Your Name N Times
**Problem:** Given a string and integer `N`, print the string exactly `N` times using recursion.

**Example**
```
Input: name = "John", N = 3
Output:
John
John
John
```

---

## B. Basic Recursive Mathematics

### 6. Sum of First N Natural Numbers
**Problem:** Find the sum of the first `N` natural numbers using recursion.

**Example**
```
Input: N = 5
Output: 15
Explanation: 1+2+3+4+5 = 15
```

---

### 7. Sum of Elements in an Array
**Problem:** Given an array of integers, find the sum of all elements using recursion.

**Example**
```
Input: [1, 2, 3, 4, 5]
Output: 15
```

---

### 8. Factorial Using Parameterized Recursion
**Problem:** Compute `N!` using parameterized recursion.

**Example**
```
Input: N = 5
Output: 120
Explanation: 5×4×3×2×1
```

---

### 9. Count Number of Digits in a Number
**Problem:** Count how many digits are present in a positive integer using recursion.

**Example**
```
Input: 12345
Output: 5
```

---

### 10. Sum of Digits of a Number
**Problem:** Find the sum of all digits of a number recursively.

**Example**
```
Input: 1234
Output: 10
Explanation: 1+2+3+4
```

---

## C. Functional Recursion

### 11. Factorial Using Functional Recursion
**Problem:** Return the factorial of a number using recursive return values.

**Example**
```
Input: 5
Output: 120
```

---

### 12. Sum of First N Numbers Using Functional Recursion
**Problem:** Return the sum of first `N` natural numbers.

**Example**
```
Input: 5
Output: 15
```

---

### 13. Fibonacci Number (Basic)
**Problem:** Find the Nth Fibonacci number using recursion.

**Example**
```
Input: N = 6
Output: 8

Sequence:
0 1 1 2 3 5 8
```

---

### 14. Power Function (x^n)
**Problem:** Calculate `x^n` using recursion.

**Example**
```
Input: x = 2, n = 5
Output: 32
```

**Follow-up:** Implement Binary Exponentiation.

---

### 15. Find Maximum Element in an Array
**Problem:** Find the largest element in an array using recursion.

**Example**
```
Input: [5, 2, 8, 1, 9]
Output: 9
```

---

## D. Array Recursion

[//]: # (### 16. Reverse an Array &#40;Two Pointers&#41;)

[//]: # (**Problem:** Reverse an array recursively using two pointers.)

[//]: # ()
[//]: # (**Example**)

[//]: # (```)

[//]: # (Input: [1, 2, 3, 4, 5])

[//]: # (Output: [5, 4, 3, 2, 1])

[//]: # (```)

[//]: # (---)

[//]: # ()
[//]: # (### 17. Check if an Array is Sorted)

[//]: # (**Problem:** Determine whether an array is sorted in non-decreasing order.)

[//]: # ()
[//]: # (**Example**)

[//]: # (```)

[//]: # (Input: [1, 2, 3, 4, 5])

[//]: # (Output: True)

[//]: # (```)

[//]: # ()
[//]: # (---)

### 18. Linear Search Using Recursion
**Problem:** Find whether a target element exists in an array.

**Example**
```
Input: [4, 8, 1, 7], target = 7
Output: True
```

---

### 19. Find First Occurrence of an Element
**Problem:** Return the first index where a target element appears.

**Example**
```
Input: [2, 4, 5, 4, 7], target = 4
Output: 1
```

---

### 20. Find Last Occurrence of an Element
**Problem:** Return the last index where a target element appears.

**Example**
```
Input: [2, 4, 5, 4, 7], target = 4
Output: 3
```

---

## E. String Recursion

### 21. Check Palindrome
**Problem:** Determine whether a string reads the same forward and backward.

**Example**
```
Input: "madam"
Output: True
```

---

### 22. Reverse a String
**Problem:** Reverse a string using recursion.

**Example**
```
Input: "hello"
Output: "olleh"
```

---

### 23. Remove All Occurrences of a Character
**Problem:** Remove every occurrence of `'a'` from a string recursively.

**Example**
```
Input: "banana"
Output: "bnn"
```

---

### 24. Replace "pi" with "3.14"
**Problem:** Replace every occurrence of `"pi"` with `"3.14"` recursively.

**Example**
```
Input: "xpix"
Output: "x3.14x"
```

---

### 25. Remove Consecutive Duplicates
**Problem:** Remove adjacent duplicate characters from a string.

**Example**
```
Input: "aaabbccdaa"
Output: "abcda"
```

---

# Recommended Order

1. Print Problems
2. Sum / Factorial Problems
3. Digit Problems
4. Functional Recursion
5. Fibonacci
6. Array Recursion
7. String Recursion
8. Backtracking Problems

After completing all 25 problems, move to:
- Subsequences
- Subsets
- Combination Sum
- Permutations
- N-Queens
- Sudoku Solver
- Recursion + Backtracking Patterns

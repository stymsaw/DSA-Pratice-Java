# Arrays — Level 1 (Patterns × Variants)

Organised to match **`array_goals.txt`**: the 8 roadmap patterns first, in your order,
then 4 extra topics. Each pattern splits into its **variants**, each with 2–3 problems
of increasing difficulty. Difficulty: 🟢 Easy · 🟡 Medium · 🔴 Hard.

Code layout — one package per pattern, one class per variant:

```
arrays/level1/<pattern>/<Variant>.java          # abstract spec (☐ checklist)
arrays/level1/<pattern>/impl/<Variant>Impl.java  # scaffold — fill these in
```

Every scaffold method throws `UnsupportedOperationException`. Implement it, then tick
its box in the abstract class. The `[ID]` (e.g. B01, K04) matches the method comments,
so IDs are grouped by source class — not by the roadmap order below.

| # | Roadmap pattern | Folder | Variants |
|---|-----------------|--------|----------|
| 1 | Two Pointers | `twopointers` | Converging · SameDirection · MultiPointer |
| 2 | Prefix Sum | `prefixsum` | OneD · TwoD · DifferenceArray · PrefixXor · PrefixProduct |
| 3 | Kadane | `kadane` | ClassicKadane · KadaneVariants |
| 4 | Sliding Window | `slidingwindow` | FixedWindow · VariableWindow · CountingWindow |
| 5 | Monotonic Stack | `monotonicstack` | NearestElement · Histogram |
| 6 | Monotonic Deque | `monotonicdeque` | WindowExtreme |
| 7 | Binary Search | `binarysearch` | OnArray · OnRotatedOrPeak · OnAnswer |
| 8 | In-place Manipulation | `basics` | Traversal · Rearrange · CyclicSort |
| + | Sorting (extra) | `sorting` | ComparatorSort · CountingSort · MergeAndSelect |
| + | Hashing (extra) | `hashing` | FrequencyMap · SetMembership |
| + | Matrix (extra) | `matrix` | Traversal · Transform · SearchMatrix |
| + | Bit / Math (extra) | `bitmath` | XorTricks · BitCounting · BitmaskMath |

**12 patterns · 33 variants · 91 problems.**

---

# Roadmap Patterns

## 1. Two Pointers  →  `twopointers/`

### Converging (opposite ends)
*Pointers start at both ends and move toward each other.*
**B01. Is Palindrome** 🟢 — `[1,2,3,2,1] → true`
**B02. Two Sum (sorted)** 🟡 — `[2,7,11,15],t=9 → [0,1]`
**B03. Container With Most Water** 🔴 — `[1,8,6,2,5,4,8,3,7] → 49`

### SameDirection (slow/fast writer)
*One pointer reads, a slower one writes — in-place compaction.*
**B04. Remove Element** 🟢 — `[3,2,2,3],val=3 → 2`
**B05. Remove Duplicates (sorted)** 🟡 — `[1,1,2,2,3] → 3`
**B06. Move Zeros (writer form)** 🟡 — `[0,1,0,3,12] → [1,3,12,0,0]`

### MultiPointer (k-Sum)
*Sort, fix one index, converge the rest.*
**B07. 3Sum** 🔴 — `[-1,0,1,2,-1,-4] → [[-1,-1,2],[-1,0,1]]`
**B08. 3Sum Closest** 🔴 — `[-1,2,1,-4],t=1 → 2`

## 2. Prefix Sum  →  `prefixsum/`

### OneD (prefix + hashmap)
*Cumulative sums; a map of seen prefixes answers subarray queries in O(n).*
**D01. Running Sum** 🟢 — `[1,2,3,4] → [1,3,6,10]`
**D02. Subarray Sum Equals K (count)** 🟡 — `[1,1,1],k=2 → 2`
**D03. Longest Zero-Sum Subarray** 🔴 — `[15,-2,2,-8,1,7,10,23] → 5`

### TwoD (integral image)
*Precompute corner sums for O(1) submatrix queries.*
**D04. Submatrix Range Sum** 🟡 — build 2D prefix once, query `(r1,c1)…(r2,c2)` in O(1).
**D05. Count Submatrices = Target** 🔴 — collapse rows + 1D prefix-count.

### DifferenceArray
*O(1) range updates; one prefix pass materializes the array.*
**D06. Apply Range Updates** 🟡 — `n` zeros + `[l,r,val]` adds → final array.
**D07. Max Concurrent (car pooling)** 🟡 — peak value after range adds on a timeline.

### PrefixXor
*XOR analog of prefix sum for subarray-XOR problems.*
**D08. Subarrays with XOR = K** 🔴 — `[4,2,2,6,4],k=6 → 4`
**D09. Longest Subarray XOR 0** 🟡 — longest span whose XOR is 0.

### PrefixProduct
*Left × right running products, no division.*
**D10. Product of Array Except Self** 🟡 — `[1,2,3,4] → [24,12,8,6]`
**D11. Longest Positive-Product Subarray** 🟡 — `[1,-2,-3,4] → 4`

## 3. Kadane / Max Subarray  →  `kadane/`

### ClassicKadane
*best-ending-here; reset when it drops below the current element.*
**E01. Maximum Subarray Sum** 🟢 — `[-2,1,-3,4,-1,2,1,-5,4] → 6`
**E02. Max Subarray with Indices** 🟡 — return `{start,end,sum}`.
**E03. Best Time to Buy/Sell** 🟡 — `[7,1,5,3,6,4] → 5`

### KadaneVariants
*Product, circular wrap, absolute-value forms.*
**E04. Maximum Product Subarray** 🟡 — `[2,3,-2,4] → 6`
**E05. Maximum Circular Subarray Sum** 🔴 — `[5,-3,5] → 10`
**E06. Max Absolute Subarray Sum** 🔴 — `[1,-3,2,3,-4] → 5`

## 4. Sliding Window  →  `slidingwindow/`

### FixedWindow
*Width k constant; add the entering element, drop the leaving one.*
**C01. Max Sum Subarray of Size K** 🟢 — `[2,1,5,1,3,2],k=3 → 9`
**C02. First Negative in Every Window** 🟡 — `[12,-1,-7,8,-15,30,16,28],k=3 → [-1,-1,-7,-15,-15,0]`
**C03. Max Average Subarray of Size K** 🟡 — `[1,12,-5,-6,50,3],k=4 → 12.75`

### VariableWindow
*Grow the right edge; shrink the left while a constraint is violated.*
**C04. Longest Substring w/o Repeating** 🟡 — `"abcabcbb" → 3`
**C05. Shortest Subarray Sum ≥ Target** 🟡 — `[2,3,1,2,4,3],t=7 → 2`
**C06. Max Consecutive Ones III** 🔴 — `[1,1,1,0,0,0,1,1,1,1,0],k=2 → 6`

### CountingWindow
*Count subarrays via `atMost(K) − atMost(K−1)`.*
**C07. Subarrays with K Distinct** 🔴 — `[1,2,1,2,3],k=2 → 7`
**C08. Count Nice Subarrays (k odds)** 🟡 — `[1,1,2,1,1],k=3 → 2`

## 5. Monotonic Stack  →  `monotonicstack/`

### NearestElement
*Monotonic stack of indices to find next/previous greater or smaller in O(n).*
**K01. Next Greater Elements (circular)** 🟡 — `[1,2,1] → [2,-1,2]`
**K02. Daily Temperatures** 🟡 — `[73,74,75,71,69,72,76,73] → [1,1,4,2,1,1,0,0]`
**K03. Previous Smaller Element** 🟡 — `[4,5,2,10,8] → [-1,4,-1,2,2]`

### Histogram
*Stack bounds widths under a height — spans and areas.*
**K04. Largest Rectangle in Histogram** 🔴 — `[2,1,5,6,2,3] → 10`
**K05. Trapping Rain Water (stack)** 🔴 — `[0,1,0,2,1,0,1,3,2,1,2,1] → 6`
**K06. Sum of Subarray Minimums** 🔴 — `[3,1,2,4] → 17`

## 6. Monotonic Deque  →  `monotonicdeque/`

### WindowExtreme
*Deque of indices gives O(1) amortized window max/min.*
**L01. Sliding Window Maximum** 🔴 — `[1,3,-1,-3,5,3,6,7],k=3 → [3,3,5,5,6,7]`
**L02. Sliding Window Minimum** 🟡 — `[1,3,-1,-3,5,3,6,7],k=3 → [-1,-3,-3,-3,3,3]`
**L03. Shortest Subarray Sum ≥ K (with negatives)** 🔴 — `[2,-1,2],k=3 → 3`

## 7. Binary Search  →  `binarysearch/`

### OnArray
*Classic halving + lower/upper-bound boundary searches.*
**H01. Binary Search** 🟢 — `[-1,0,3,5,9,12],t=9 → 4`
**H02. First Occurrence (lower bound)** 🟡 — `[5,7,7,8,8,10],t=8 → 3`
**H03. Count Occurrences** 🟡 — `[5,7,7,8,8,10],t=8 → 2`

### OnRotatedOrPeak
*Decide which half is sorted, or climb to a peak.*
**H04. Search in Rotated Sorted Array** 🟡 — `[4,5,6,7,0,1,2],t=0 → 4`
**H05. Minimum in Rotated Array** 🟡 — `[3,4,5,1,2] → 1`
**H06. Find Peak Element** 🟡 — `[1,2,1,3,5,6,4] → 5`

### OnAnswer (parametric)
*Binary-search the value space; a monotonic feasibility test picks the half.*
**H07. Koko Eating Bananas** 🔴 — `[3,6,7,11],h=8 → 4`
**H08. Capacity to Ship in D Days** 🔴 — `[1..10],days=5 → 15`
**H09. Split Array Largest Sum** 🔴 — `[7,2,5,10,8],k=2 → 18`

## 8. In-place Array Manipulation  →  `basics/`

### Traversal (extremes & scanning)
**A01. Find Maximum** 🟢 — `[3,9,2,7] → 9`
**A02. Second Largest** 🟢 — `[12,35,1,35] → 12`
**A03. Min and Max in One Pass** 🟡 — `[3,1,4,1,5] → {1,5}`

### Rearrange (swapping / reversal)
**A04. Reverse Array** 🟢 — `[1,2,3,4] → [4,3,2,1]`
**A05. Move Zeros to End** 🟡 — `[0,1,0,3,12] → [1,3,12,0,0]`
**A06. Rotate Array by K** 🟡 — `[1,2,3,4,5,6,7],k=3 → [5,6,7,1,2,3,4]`

### CyclicSort (cyclic placement)
*Swap each value to index value−1; exposes missing/duplicate in O(n), O(1) space.*
**A07. Cyclic Sort (1..n)** 🟡 — `[3,1,5,4,2] → [1,2,3,4,5]`
**A08. Missing Number (0..n)** 🟡 — `[3,0,1] → 2`
**A09. First Missing Positive** 🔴 — `[3,4,-1,1] → 2`

---

# Extra Topics (beyond goals.txt)

## Sorting-Based  →  `sorting/`

### ComparatorSort
**F01. Merge Intervals** 🟡 — `[[1,3],[2,6],[8,10]] → [[1,6],[8,10]]`
**F02. Largest Number** 🟡 — `[3,30,34,5,9] → "9534330"`
**F03. Sort by Frequency** 🟡 — `[1,1,2,2,2,3] → [2,2,2,1,1,3]`

### CountingSort (counting / bucket)
**F04. Sort Colors (Dutch flag)** 🟡 — `[2,0,2,1,1,0] → [0,0,1,1,2,2]`
**F05. Top K Frequent** 🔴 — `[1,1,1,2,2,3],k=2 → [1,2]`
**F06. Maximum Gap** 🔴 — `[3,6,9,1] → 3`

### MergeAndSelect
**F07. Merge Two Sorted Arrays** 🟢 — `[1,3,5]+[2,4,6] → [1,2,3,4,5,6]`
**F08. Kth Largest (quickselect)** 🟡 — `[3,2,1,5,6,4],k=2 → 5`
**F09. Count Inversions** 🔴 — `[8,4,2,1] → 6`

## Hashing / Frequency  →  `hashing/`

### FrequencyMap
**G01. Majority Element** 🟢 — `[2,2,1,1,1,2,2] → 2`
**G02. First Unique Element** 🟡 — `[2,3,2,4,3] → 3`
**G03. Count Pairs with Given Difference** 🟡 — `[1,5,3,4,2],diff=3 → 2`

### SetMembership
**G04. Two Sum (unsorted)** 🟢 — `[2,7,11,15],t=9 → [0,1]`
**G05. Contains Nearby Duplicate** 🟡 — `[1,2,3,1],k=3 → true`
**G06. Longest Consecutive Sequence** 🔴 — `[100,4,200,1,3,2] → 4`

## 2D / Matrix  →  `matrix/`

### Traversal
**I01. Spiral Order** 🟡 — `[[1,2,3],[4,5,6],[7,8,9]] → [1,2,3,6,9,8,7,4,5]`
**I02. Diagonal Order** 🟡 — `→ [1,2,4,7,5,3,6,8,9]`
**I03. Boundary Traversal** 🟡 — border clockwise from top-left.

### Transform (in-place)
**I04. Transpose** 🟢 — rows ↔ columns.
**I05. Rotate 90° Clockwise** 🟡 — `→ [[7,4,1],[8,5,2],[9,6,3]]`
**I06. Set Matrix Zeroes** 🔴 — zero each 0's row+column, O(1) extra space.

### SearchMatrix
**I07. Search Row+Col Sorted Matrix** 🟡 — staircase from top-right, O(m+n).
**I08. Search Fully Sorted Matrix** 🟡 — binary search on flattened index.

## Bit / Math  →  `bitmath/`

### XorTricks
**J01. Single Number** 🟢 — `[4,1,2,1,2] → 4`
**J02. Two Non-Repeating** 🟡 — `[1,2,3,2,1,4] → [3,4]`
**J03. Missing and Repeating** 🟡 — `[3,1,3,4,5] → {3,2}`

### BitCounting
**J04. Count Bits 0..n** 🟢 — `n=5 → [0,1,1,2,1,2]`
**J05. Hamming Distance** 🟡 — `x=1,y=4 → 2`
**J06. Reverse Bits** 🟡 — reverse the 32 bits of x.

### BitmaskMath
**J07. Subsets via Bitmask** 🟡 — `[1,2,3] → 8 subsets`
**J08. Maximum XOR of Two Numbers** 🔴 — `[3,10,5,25,2,8] → 28`

---

# How to Use This (FAANG prep)

1. Work the 8 roadmap patterns top-to-bottom — that's your interview core.
2. For each variant, solve the 🟢 first to lock the template, then 🟡 → 🔴.
3. Re-solve from scratch a day later; aim for a clean medium in ~20 min.
4. The extra topics (Sorting/Hashing/Matrix/Bit) round out coverage — do after the core.
5. Cross-check against your Top-10 list in `array_goals.txt`; all ten now have a home here.

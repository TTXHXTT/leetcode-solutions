\# LeetCode Solutions



This repository contains my \*\*LeetCode problem solutions\*\* in Java and Python.  

Each solution is well-documented with explanation and complexity analysis.  



\## 📂 Structure

\- `java/`: Solutions in Java

\- `python/`: Solutions in Python

\- Organized by problem number and title.



\## 📘 Solved Topics

\- Array

\- String

\- HashMap

\- Dynamic Programming

\- Tree \& Graph

\- Backtracking



\## 🔥 Progress

\- Total Solved: 120

\- Easy: 50 | Medium: 55 | Hard: 15



---



\## Example: Two Sum (LC #1)

\*\*Problem:\*\*  

Given an array of integers, return indices of the two numbers such that they add up to a specific target.



\*\*Solution (Java):\*\*

```java

class Solution {

&nbsp;   public int\[] twoSum(int\[] nums, int target) {

&nbsp;       Map<Integer, Integer> map = new HashMap<>();

&nbsp;       for (int i = 0; i < nums.length; i++) {

&nbsp;           int complement = target - nums\[i];

&nbsp;           if (map.containsKey(complement)) {

&nbsp;               return new int\[] { map.get(complement), i };

&nbsp;           }

&nbsp;           map.put(nums\[i], i);

&nbsp;       }

&nbsp;       return new int\[] {};

&nbsp;   }

}




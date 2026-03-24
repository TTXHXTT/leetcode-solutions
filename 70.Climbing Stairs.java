class Solution {

This is a dynamic programming problem.

I use memoization to avoid repeated compute.

To reach step n,
we can come from step n-1 or n-2.

So the result is the sum of the previous two.

Time is O(n), space is O(n).

    
//本质上与斐波那契数列是一样的
//每次走一步或者两步，那么  Res-> n = n-1  +  n-2;不断递归
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        return c(n);

    }
    public int c (int n){
        if(n<=2) return n;
        if(memo[n]!=0) return memo[n];
        memo[n]=c(n-1)+c(n-2);
        return memo[n];
    }

}

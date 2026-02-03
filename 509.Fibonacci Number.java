class Solution {
    //留存算过的数，防止重算
    int[] memo;
    public int fib(int n) {
        memo =new int[n+1];
        return f(n);
    }

    public int f(int n){
        if(n==1||n==0){
            int i=(n==1) ? 1 : 0;
            return i;
        }
        //计算前查看是否算过
        if(memo[n]!=0) return memo[n];
        memo[n]=f(n-1)+f(n-2);
        return  memo[n];
    }
}

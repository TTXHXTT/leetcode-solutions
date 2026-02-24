class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        //如果出现重复数字 → 说明进入循环 → return false
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    // 计算各位数字平方和
    private int getNext(int n) {
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;   // 取个位
            sum += digit * digit; // 加平方
            n /= 10;              // 去掉个位
        }
        
        return sum;
    }
}

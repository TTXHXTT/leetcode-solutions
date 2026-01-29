class Solution {
    public boolean isPalindrome(String s) {

        //toLowerCase()方法将字母小写
        //replaceAll方法正则：将括号内前面的值替换成后面的值
        //“^”为取反
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");

        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

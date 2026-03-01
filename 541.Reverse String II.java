class Solution {
    public String reverseStr(String s, int k) {

        First, I convert(转化) the string into a char array.
        I store the length of the string. And I use i as the starting index of each block.
        The while loop ensures that the starting index does not go out of bounds.
        j is the end index of the reverse posetion. I use Math.min to avoid going out of bounds.
        Then I call the reverse function.reverse the characters between i and j.
        After that, I move i forward by 2k.

            In the reverse function, I use two pointers.
            While left pointer is smaller than right pointer, I swap the characters.

        Finally, I convert the char array back to a string.

        Time complexity is O(n), because each character is visited at most once.
        Space complexity is O(n), because we convert the string to a char array.

            
        //将字符串转成数组
        char[] ch = s.toCharArray();

        int a=s.length();
        int i=0;

        //确保在长度内进行比较
        while(i<a){
            //取前值时说明未超出范围
            //取后时说明剩余长度不足k，全部反转
            int j=Math.min(i+k-1,a-1);
            reverse(ch,i,j);

            i+=2*k;
        }

        return new String(ch);

    }

    public void reverse(char[] ch,int i,int j){
        while(i<j){
            char c = ch[i];
            ch[i] = ch[j];
            ch[j] = c;
            i++;
            j--;
        }


    }
}

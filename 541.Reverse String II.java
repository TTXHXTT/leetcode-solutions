class Solution {
    public String reverseStr(String s, int k) {
        
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

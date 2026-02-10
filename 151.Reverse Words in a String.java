class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();

        int i = s.length()-1;
        
        // 只要还没扫完整个字符串
        while(i>=0){
            // 1️⃣ 跳过空格（处理尾部空格 & 单词间空格）
            while(i>=0&&s.charAt(i)==' ') i--;

            if(i<0) break;
            // 2️⃣ j 记录单词的结尾位置
            int j=i;
            // 3️⃣ 向左找到单词的起始位置
            while(i>=0&&s.charAt(i)!=' ') i--;
            // 4️⃣ 截取单词并加入结果
            // substring 左闭右开，所以是 i+1 到 j+1
            res.append(s.substring(i+1,j+1)).append(" ");
        }
        // 5️⃣ 去掉最后多加的那个空格
        return res.toString().trim();
    }
}

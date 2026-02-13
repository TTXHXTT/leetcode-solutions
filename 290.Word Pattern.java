class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null||s==null) return false;
        
        // 把 s 拆成单词数组
        String[] a = s.split(" ");

        // 长度必须一致
        if(a.length!=pattern.length()) return false;

        HashMap<Character,String> m1 = new HashMap<>();
        HashMap<String,Character> m2 = new HashMap<>();

        for(int i = 0;i<pattern.length();i++){
            char c1=pattern.charAt(i);
            String c2=a[i];

            if(m1.containsKey(c1)){
                if(!m1.get(c1).equals(c2)){
                    return false;
                }
            }else{
                if(m2.containsKey(c2)){
                    return false;
                }
            }

            m1.put(c1,c2);
            m2.put(c2,c1);

        }

        return true;
    }
}

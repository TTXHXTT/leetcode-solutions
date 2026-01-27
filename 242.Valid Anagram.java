class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
           return false;
        }

        
        HashMap<Character , Integer> counter =  new  HashMap<>();

        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            //counter.getOrDefault(ch, 0) + 1)意思为对比数组中有无ch，有则输出对应的vaule+1没有输出0+1
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }
        for (int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            //对比在表中有没有与ch相同的字符，或相同字符vaule==0的
            if(!counter.containsKey(ch)||counter.get(ch)==0){
                return false;
            }
            counter.put(ch,counter.get(ch)-1);
        }
        return true;
    }
}

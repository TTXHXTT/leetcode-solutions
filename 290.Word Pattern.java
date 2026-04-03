class Solution {
    public boolean wordPattern(String pattern, String s) {

First, I split the string into words.
If the number of words does not match the pattern length, I return false.

Then I use two hash maps.
One maps characters to words,
and the other maps words to characters.

As I go through them,
I make sure the mapping is consistent in both directions.

If not, I return false.
Otherwise, I update the maps.

Time is O(n), space is O(n).
        
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

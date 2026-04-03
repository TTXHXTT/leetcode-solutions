
class Solution {
    public boolean isIsomorphic(String s, String t) {

I use two arrays to track the last seen positions of characters.

As I go through both strings,
I check if the positions match.

If not, the mapping is invalid.

Otherwise, I update the positions.

Time is O(n), space is O(1).
        
        if(s.length()!=t.length()) return false;
        //使用ASCII来代替hashmap
        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            //曾经出现过已经建立关系的字符，判断是否能映射回去
            if(mapS[c1]!=mapT[c2]) return false;
            
            //比较的是“出现模式是否一致”
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;         
        }


        return true;
    }
}

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> mapa=new HashMap<>();
        HashMap<Character,Character> mapb=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            // 如果之前已经建立映射
            if(mapa.containsKey(c1)){
                if(mapa.get(c1)!=c2)  return false;
            }else{
                //如果c1没出现再1号map，然而c2出现在2号map
                //那说明c2被其他人映射
                if(mapb.containsKey(c2)) return false;
            }

            mapa.put(c1,c2);
            mapb.put(c2,c1);
        }

        return true;
    }
}

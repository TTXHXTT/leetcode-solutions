class Solution {
    public void reverseString(char[] s) {

I use two pointers,
one from the left and one from the right.

I swap the characters
and move both pointers toward the center.

Time is O(n), space is O(1).

        int i=0,j=s.length-1;
        while(i<j){
            char a = s[i];
            s[i]=s[j];
            s[j]=a;
            i++;
            j--;
        }
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int a=0;
        for(int i=s.length()-1;i>-1;i--)
        {
            if(a==0 && s.charAt(i)!=' ')
                a++;
            else if(a!=0 && s.charAt(i)!=' ')
                a++;
            else if(a!=0 && s.charAt(i)==' ')
                return a;
        }
        return a;
    }
}
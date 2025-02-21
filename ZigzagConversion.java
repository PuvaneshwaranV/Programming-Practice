class Solution {
    public String convert(String s, int numRows) {
        char ans[][]=new char[numRows][s.length()];
        int r=0;
        int col=0;
        int cur=0;
        while(cur < s.length())
        {
            while(r < numRows && cur < s.length())
            {
                ans[r++][col]=s.charAt(cur++);
            }
            r=Math.max(0,r-2);
            while(r > 0 && cur < s.length()){
                ans[r--][++col]=s.charAt(cur++); 
            }
            col++;
        }
        String res = "";
        for(int i=0;i < numRows;i++)
        {
            for(int j=0;j < s.length();j++)
            {
                if(ans[i][j]!='\0')
                
                res+=ans[i][j];
            }
        }
        return res;
    }
}
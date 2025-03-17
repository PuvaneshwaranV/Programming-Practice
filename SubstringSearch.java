class SubstringSearch
{
    static int substring(String a,String s)
    {
        for(int i=0;i<a.length();i++)
        {
            int k=i;
            int j;
            for(j=0;j<s.length();j++)
            {
                if(a.charAt(k++)!=s.charAt(j))
                    break;
            }
            if(j==s.length())
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String a="abdabgshbag";
        String s="ab";
        int ans=substring(a,s);
        System.out.print(ans);
    }
}
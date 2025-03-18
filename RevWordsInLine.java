class RevWordsInLine
{
    public static void main(String[] args)
    {
        String s="Hi sweety I Love You";
        String sw[]=s.split(" ");
        String ans="";
        for(int i=0;i<sw.length;i++)
        {
            String s1=sw[i];
            for(int j=s1.length()-1;j>=0;j--)
            {
                ans+=s1.charAt(j);
            }
            ans+=" ";
        }
        System.out.print(ans);
    }
}
public class substring {
    public static void main(String[] args){
    String s="abcddefgegom";
    String s1="abefuefglkom";
    String s2="";
    String s3="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=s1.charAt(i))
        {
            s2+=s.charAt(i);
            s3+=s1.charAt(i);
        }
        else if(s2.length()>0)
        {
            System.out.println(s2+","+s3);
            s2="";
            s3="";
        }
    }}
}

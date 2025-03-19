public class AnagramCheck {
 static String anagram(String s, String s1)
 {
    char[] a=s.toCharArray();
    char[] b=s1.toCharArray();
    if(a.length==b.length)
    {
        for(int i=0;i<a.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<a.length-i-1;j++)
            {
                int k=a[j];
                int m=a[j+1];
                if(k>m)
                {
                    char temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        for(int i=0;i<b.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<b.length-i-1;j++)
            {
                int k=b[j];
                int m=b[j+1];
                if(k>m)
                {
                    char temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
        for(int i=0,j=0;i<a.length;)
        {
            if(a[i++]!=b[j++])
                return "Not an Anagram";
        }
        return "It's an Anagram";
    }
    else
        return "Not an Anagram";
 }
 public static void main(String[] args)
 {
    String s="Silent";
    String s1="Listen";
    String ans=anagram(s.toLowerCase(),s1.toLowerCase());
    System.out.print(ans);
 }   
}

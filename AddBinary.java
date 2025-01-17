class Solution {
    public String addBinary(String a, String b) {
     long i=1;int j=a.length()-1,k=b.length()-1;long ans=0;
     while(j>-1 || k>-1)
     {
        if(j>-1)
        {
            if(a.charAt(j)=='1')
                ans+=i;
            j--;
        }
        if(k>-1)
        {
            if(b.charAt(k)=='1')
                ans+=i;
            k--;
        }
        i=i*2;
     }
     String s="";
     if(ans==0)
        return "0";
     while(ans>0)
     {
        if(ans%2==0)
            s+='0';
        else
            s+='1';
        ans/=2;
     }
     j=s.length()-1;;
     String s1="";
     while(j>-1)
     {
        s1+=s.charAt(j);
        j--;
     }
     return s1;
    }
}
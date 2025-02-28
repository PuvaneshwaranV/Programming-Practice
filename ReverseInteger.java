class Solution {
    public int reverse(int x) {
     long m=x;long ans=0;
     if(m<0)   
        m=-1 * m;
        int i=1;
    while(m>0)
    {
        long rem=m%10;
        ans=(ans*i)+rem;
        m/=10;
        i=10;
    }
    if(x<0)
        ans=-1 * ans;
    if(ans<-2147483648 || 2147483647<ans)
    return 0;
    int ans1=(int)ans;
    return ans1;
    }
}
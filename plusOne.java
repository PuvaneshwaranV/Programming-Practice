class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length-1]!=9)
        {
            digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
        }
        int n=0;
        for (int num : digits) {
            if (num != 9) {
                n=1;
                break;
            }
        }
        if(n==0)
            n=digits.length+1;
        else
            n=digits.length;
        int[] a=new int[n];
        int i=0;
        for(i=digits.length-1;i>-1 && digits[i]==9;i--)
        {
            if(i==digits.length-1 && i!=0)
                a[i]=0;
            else if(i!=0 && digits[i]==9)
                a[i]=0;
            else if(i==0 && digits[i]==9)
                a[i]=1;
        }
        for(int j=i;j>-1;j--)
        {
            if(j==i)
                a[j]=++digits[j];
            a[j]=digits[j];
        }
        return a;
    }
}
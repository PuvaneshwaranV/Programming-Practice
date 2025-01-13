class AddWithoutAddSub
{
    public static int AddWithoutArithmentic(int a,int b)
    {
        while(b!=0)
        {
            int carry=(a&b) << 1;
            a=a^b;
            b=carry;
        }
        return a;
    }
    public static void main(String arg[])
    {
        int a=15;
        int b=31;
        int result=AddWithoutArithmentic(a,b);
        System.out.print("Sum of Two Numbers: "+result);
    }
}
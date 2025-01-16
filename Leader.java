import java.util.*;
class first
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length");
        int n=s.nextInt();
        int c=0,k=0;
        int[] a=new int[n];
        int[] a1=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=n-1;i>-1;i--)
        {
            if(i==n-1)
            {
                a1[k++]=a[i];
                c=a[i];
            }
            else if(c<a[i])
            {
                a1[k++]=a[i];
                c=a[i];
            }
        }
        System.out.print("[");
        for(int i=k-1;i>-1;i--)
        {
            if(i!=0)
                System.out.print(a1[i]+", ");
            else
            System.out.print(a1[i]);
        }
        System.out.print("]");
    }
}
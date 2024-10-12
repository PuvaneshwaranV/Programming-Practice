class do1
{
    public int tc(int[] arr,int m)
    {   int sum=0;
        for(int i=0;i<arr.length;i++)
        {   
            int a=arr[i];
            while(a>=m ||a>0)
            {
                a=a-m;
                sum++;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
public class TotalCount  {
    public static void main(String arg[]) {
        int[] arr = {10,2,3,4,7};
        int m=4;
        do1 s = new do1();
        int sum = s.tc(arr,m);
        System.out.println(sum);
    }
}
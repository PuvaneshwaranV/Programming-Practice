public class SumOrMulti {
    static int[] sumormulti(int[] arr)
    {
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            int multi=1;
            int m=arr[i];
            while(m>0)
            {
                int mod=m%10;
                sum+=mod;
                multi*=mod;
                m/=10;
            }
            if(multi>sum)
                arr1[i]=multi;
            else    
                arr1[i]=sum;
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        int arr[]={120,24,71,10,59};
        int arr1[]=sumormulti(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}

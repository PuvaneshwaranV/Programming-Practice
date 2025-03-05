public class ZeroFrontWithoutSort {
    public static void main(String[] args)
    {
        int[] arr={2,0,4,5,0,4,0,1,0};
        int j=0;
        for(int i=arr.length-1;i>=0 && i>j;i--)
        {
            if(arr[i]==0)
            {
                while(j<arr.length && i>j && arr[j]==0)
                    j++;
                if(j<arr.length && arr[j]!=0)
                {
                    arr[i]=arr[j];
                    arr[j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

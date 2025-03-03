public class FrequencySort
{
    public static void main(String[] args)
    {
        int[] arr={4,2,3,5,4,1,3,4,8,2,3,0};
        int[] unique=new int[arr.length];
        int[] count=new int[arr.length];
        for(int i=0;i<unique.length;i++)
        {
            unique[i]=Integer.MAX_VALUE;
        }
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=-1)
            {
                unique[k]=arr[i];
                count[k]++;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j]){
                        arr[j]=Integer.MAX_VALUE;
                    count[k]++;}
                 }
                k++;
            }
        }
        boolean swapped;int temp;
        for(int i=0;i<count.length-1;i++)
        {
            swapped=false;
            for(int j=0;j<count.length-i-1;j++)
            {
                if(count[j]!=0 && count[j+1]!=0 &&count[j]>count[j+1])
                {
                    temp=count[j];
                    count[j]=count[j+1];
                    count[j+1]=temp;

                    temp=unique[j];
                    unique[j]=unique[j+1];
                    unique[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped=false)
                break;
        }k=0;
        for(int i=unique.length-1;i>=0;i--)
        {
            if(unique[i]==Integer.MAX_VALUE)
                continue;
            for(int j=0;j<count[i];j++)
            {
                arr[k]=unique[i];
                System.out.print(arr[k]+" ");
                k++;
            }
        }
    }
}
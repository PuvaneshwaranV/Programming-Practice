public class ExtraElement {
    public static void main(String[] args)
    {
        int a[]={10,20,30,5};
        int b[]={10,5,30,20,12};
        int c=0;
        if(a.length>b.length){
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
                System.out.print(a[i]+" is the extra element in array 1 at index "+i);
        }}
        else{
            for(int i=0;i<b.length;i++)
        {
            c=0;
            for(int j=0;j<a.length;j++)
            {
                if(b[i]==a[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
                System.out.print(b[i]+" is the extra element in array 2 at index "+i);
        }
        }
    }
}

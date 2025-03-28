class EquilibriumIndex {
    static int equilibrium(int arr[])
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        int left=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(left==total-left-arr[i])
                return i;
            left+=arr[i];
        }
        return -1;
    }
 public static void main(String[] args)
 {
    int arr[]={-7,1,5,2,-4,3,0};
    System.out.print("Equilibrium index : "+equilibrium(arr));
 }   
}

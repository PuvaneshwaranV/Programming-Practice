class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length>0)
        {
            int i=nums2.length-1;
            int j=nums1.length-1;
            while(i>-1)
            {
                nums1[j--]=nums2[i--];
            }
            for(i=0;i<nums1.length-1;i++)
            {
               int v=i;
                for(j=i+1;j<nums1.length;j++)
                {
                    if(nums1[v]>nums1[j])
                        v=j;
                }
                int k=nums1[i];
                nums1[i]=nums1[v];
                nums1[v]=k;
            }
            for(i=0;i<nums1.length;i++)
            {
                System.out.print(nums1[i]);
            }
        }
        
    }
}
class MergeTwoSortedArray {
    
    public static void main(String[] args) {
        Solution s=new Solution();
        int nums1[]={4,5,6,0,0,0};
        int nums2[]={1,2,3};
        int m=3;
        int n=3;
        s.merge(nums1,m,nums2,n);
    }
}
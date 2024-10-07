import java.util.Scanner;
class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int k=0,p=1;
        for(int i=nums.length-1;i>=0;i--)
        {
                if(nums[i]==val)
                {
                    nums[i]=nums[nums.length-p];
                    nums[nums.length-p]=0;
                    p++;
                    k++;
                }
        }
        k=nums.length-k;
        return k;
    }
}
public class RemoveElement
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        Solution s1=new Solution();
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        int k=s1.removeElement(nums,val);
        for(int i=0;i<k;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
class Solution1 {
    public int LPS(int[] arr) {
        int sum = 0;
        if (arr.length > 1) {
            int k = arr[0], m = arr[1];
            if (m > k) {
                arr[0] = m;
                arr[1]=k;
                k=arr[0];
                m=arr[1];
            }
            for (int i = 2; i < arr.length; i++) {
                if(arr[i]>m)
                {
                    if(arr[i]>k){
                        m=k;
                        k=arr[i];
                    }
                    else
                        m=arr[i];
                }
            }
            sum=k+m;
            return sum;
        } else if (arr.length == 0)
            return 0;
        else
            return arr[0];
    }
}
public class LargestPairSum {
    public static void main(String arg[]) {
        int[] arr = {-10,-20,30};
        Solution1 s = new Solution1();
        int sum = s.LPS(arr);
        System.out.println(sum);
    }
}

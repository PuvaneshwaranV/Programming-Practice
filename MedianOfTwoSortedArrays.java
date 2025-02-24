class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int n = num1.length;
        int m=num2.length;
        int ans []=new int[n+m];
        int i=0,j=0,t=0;
        double dou=0;
        while(i < n && j < m){
            
            if(num1[i] <= num2[j])
            {
                ans[t++] = num1[i++];
            }
            else if(num1[i] > num2[j])
            {
                ans[t++] = num2[j++];
            }
        }
        while(i<n){
                ans[t++]  = num1[i++];
        }
        while(j<m){
            ans[t++]  = num2[j++];
        }
      if((n+m)%2==0)
      {
        dou=(double)(ans[((n+m)/2)-1]+ans[(n+m)/2])/2;
      }
      else
        dou=ans[(n+m)/2];
    return dou;
}}
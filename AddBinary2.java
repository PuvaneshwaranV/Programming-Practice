class Solution {
    public String addBinary(String a, String b) {
        String c="";
        int i=a.length()-1;
        int j=b.length()-1;
        int car = 0;
        while(i >= 0 || j >= 0){
            if(i>=0 && j>=0)
            {
                if(a.charAt(i)=='1' && b.charAt(j)=='1')
                {
                    if(car==0){
                    c+='0';
                    car=1;}
                    else{
                    c+='1';
                    car=1;}
                }
                else if(a.charAt(i)=='0' && b.charAt(j)=='0'){
                    if(car==1){
                        c+='1';
                        car=0;
                    }
                    else 
                        c+='0';

                }
                else{
                    if(car==1){
                        c+='0';
                        car=1;
                    }
                    else {
                        c+='1';
                    }
                } 
            j--;i--;
            }
            else if(i>=0)
            {
                if(a.charAt(i)=='1' && car ==1){
                    c+='0';
                    car =1;
                }
                else if(a.charAt(i)=='0' && car==1){
                    c+='1';
                    car=0;
                }
                else 
                    c+=a.charAt(i);
                    i--;
            }

            else if(j>=0)
            {
            if(b.charAt(j)=='1' && car ==1){
                    c+='0';
                    car =1;
                }
                else if(b.charAt(j)=='0' && car==1){
                    c+='1';
                    car=0;
                }
                else 
                    c+=b.charAt(j);
                    --j;
            }
            
           
        }
         if(car == 1){
                c+='1';
                car=0;
            }
        String ans="";
        for(int k=c.length()-1 ; k >= 0 ; k--)
        {
            ans+=c.charAt(k);
        }
        return ans;
    }
}
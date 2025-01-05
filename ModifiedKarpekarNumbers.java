import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void kaprekarNumbers(int p, int q) {
    List<Integer> a1=new ArrayList<>();
    while(p<q+1)
    {
        int n=String.valueOf(p).length();
        long o=(long)p*p;
        String m=Long.toString(o);
       int  k=m.length();
        long a=0;
        if(k==2)
         a=Integer.parseInt(m.substring(0,1));
        else if(k==3)
            a=Integer.parseInt(m.substring(0,n-1));
        else if(k>3 && k%2==0)
        a=Integer.parseInt(m.substring(0,n));
        else if(k>3 && k%2!=0)
        a=Integer.parseInt(m.substring(0,n-1));
        int b=Integer.parseInt(m.substring(k-n,k));
        if((a+b)==p)
        {
            a1.add(p);
        }
        p++;
    }
    if(a1.size()>0)
    {
    for(int i=0;i<a1.size();i++)
    {
        if(i!=a1.size()-1)
        System.out.print(a1.get(i)+" ");
        else
        System.out.print(a1.get(i));
    }}
    else
    System.out.print("INVALID RANGE");
    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}

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
    public static long repeatedString(String s, long n) {
    int ans=0,m=0;long l=0;
    if(n>s.length()){
    l=n%s.length();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==97)
        {
            if(l>0)
            {
            ans++;
            m++;
            }
            else
            m++;
        }
        l--;
    }
        l=((n/s.length())*m)+ans;
        return l;}
    else
    {
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==97)
                l++;
        }
    return l;
    }
    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

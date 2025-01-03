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
    public static String encryption(String s) {
    int l=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)!=' ')
            l++;
    }
    int m=(int)Math.ceil(Math.sqrt(l));
    char[][] ch=new char[m][m];
    int k=0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(k<l){
            if(s.charAt(k)!=' ')
                ch[i][j]=s.charAt(k++);
            else
            {
                j--;k++;
            }}
            else
                ch[i][j]='>';
        }
    }
    String ans="";
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<m;j++)
        {
            if(ch[j][i]!='>')
                ans+=ch[j][i];
        }
        if(i!=m-1)
        ans+=' ';
    }
    return ans;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

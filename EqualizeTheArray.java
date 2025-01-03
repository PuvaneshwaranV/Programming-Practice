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
    public static int equalizeArray(List<Integer> arr) {
    int i=0,fre=0,in=1;
    while(arr.size()!=i)
    {
        if(i==0)
        {
            for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(i)==arr.get(j))
            {
                arr.set(j,0);
                in++;
            }
        }
        }
        else if(arr.get(i)!=0){
        fre=1;
        for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(j)!=0 && arr.get(i)==arr.get(j))
            {
                arr.set(j,0);
                fre++;
            }
        }
        }
       if(fre>in)
            in=fre;
        i++;
    }
    return arr.size()-in;
    }

}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

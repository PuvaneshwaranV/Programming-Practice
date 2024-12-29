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
    public static List<Integer> cutTheSticks(List<Integer> arr) {
    List<Integer> ans=new ArrayList<Integer>();
    int n=arr.size();
    while(n>0)
    {
        ans.add(n);
        int s=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            if(s<1 && arr.get(i)>0)
                s=arr.get(i);
            else if(s>arr.get(i) && arr.get(i)>0)
                s=arr.get(i);
        }
        int k=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>0)
                arr.set(i,arr.get(i)-s);
            if(arr.get(i)!=0)
                k++;
        }
        n=k;
    }
    return ans;

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

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

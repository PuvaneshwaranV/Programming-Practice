import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

   
    public static int migratoryBirds(List<Integer> arr) {
        
     List<Integer> type = new ArrayList<Integer>();
     Collections.addAll(type,0,0,0,0,0);
        for(int i=0;i<arr.size();i++)
        {
          type.set(arr.get(i)-1,type.get(arr.get(i)-1)+1);  
        }
        int k=type.get(type.size()-1);
        int m=type.size();
       for(int i=type.size()-2;i>-1;i--)
       {
        if(k<=type.get(i))
        {
            k=type.get(i);
            m=i+1;
        }
       }
        return m;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

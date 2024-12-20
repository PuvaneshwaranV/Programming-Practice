import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

        

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here
        List<Integer> s=new ArrayList<>();
        Collections.sort(arr);
        Collections.sort(brr);
       
        for(int i=0;i<brr.size();i++)
        { int j=0;
            for(j=0;j<arr.size();j++)
            {
                 if(brr.get(i).equals(arr.get(j)))
                 {
                     arr.set(j,-1);
                     break;
                 }
            }
           if(j==arr.size() &&  !s.contains(brr.get(i)))
           {
              // System.out.print("hi");
                s.add(brr.get(i));
           }
        }
        return s;
    }

}

public class MissingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

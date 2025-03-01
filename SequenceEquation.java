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

class Result1 {
    public static List<Integer> permutationEquation(List<Integer> p) {
        List<Integer> a=new ArrayList<>();
        int i=1,j=0,k=0;
    while(i<=p.size())
    {
        for(j=0;j<p.size();j++)
        {
            if(p.get(j)==i)
                break;
        }
        j++;
        for(k=0;k<p.size();k++)
        {
            if(p.get(k)==j)
                break;
        }
        a.add(++k);
        i++;
    }
    return a;
    }

}
class Soltion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> p = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList()); 

        List<Integer> result = Result1.permutationEquation(p);

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

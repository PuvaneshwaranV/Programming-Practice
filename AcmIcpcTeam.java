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
    public static List<Integer> acmTeam(List<String> topic) {
    List<Integer> te=new ArrayList<Integer>();
    int n=0,m=0;
    for(int i=0;i<topic.size();i++)
    {
        for (int j=i+1;j<topic.size();j++)
        {
            String s=topic.get(i);
            String s1=topic.get(j);
            int k=0,l=0;
            while(k<s.length())
            {
                if(s.charAt(k)==49 || s1.charAt(k)==49)
                    l++;
                k++;
            }
            if(l==m)
            {
                n++;
            }
            else if(l>m)
            {
                m=l;
                n=1;
            }
        }
    }
    te.add(m);
    te.add(n);
    return te;

    }

}

class AcmIcpcTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.acmTeam(topic);

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

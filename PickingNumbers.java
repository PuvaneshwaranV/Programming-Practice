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
    public static int pickingNumbers(List<Integer> a) {
        int in = 0, de = 0, ans = 0;
        for (int i = 0; i < a.size(); i++) {
            in = 0;
            de = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j) || a.get(i) == (a.get(j) + 1))
                    in++;
                if (a.get(i) == a.get(j) || a.get(i) == (a.get(j) - 1))
                    de++;
            }
            if (ans < in || ans < de) {
                if (in >= de)
                    ans = in;
                else if (de > in)
                    ans = de;
            }
        }
        return ans;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

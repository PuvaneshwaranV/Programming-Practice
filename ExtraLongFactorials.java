import java.io.*;
import java.math.*;
import java.math.BigInteger;
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
    public static void extraLongFactorials(int n) {
        BigInteger ans=BigInteger.valueOf(1);
    while(n>0)
    {
        BigInteger n1=BigInteger.valueOf(n);
        ans=ans.multiply(n1);
        n--;
    }
        System.out.print(ans);
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.extraLongFactorials(n);

        bufferedReader.close();
    }
}

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
   public static String timeInWords(int h, int m) {
    String s="";
    String[] hours = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"
        };

        // Minutes array (o' clock to 59 minutes)
        String[] minutes = {
            "o' clock", "one minute", "two minutes", "three minutes", "four minutes", "five minutes", 
            "six minutes", "seven minutes", "eight minutes", "nine minutes", "ten minutes",
            "eleven minutes", "twelve minutes", "thirteen minutes", "fourteen minutes", "quarter",
            "sixteen minutes", "seventeen minutes", "eighteen minutes", "nineteen minutes", "twenty minutes",
            "twenty one minutes", "twenty two minutes", "twenty three minutes", "twenty four minutes", "twenty five minutes",
            "twenty six minutes", "twenty seven minutes", "twenty eight minutes", "twenty nine minutes", "half"
        };
        if(m>30)
        {
            s=minutes[60-m]+" to "+hours[h+1];
        }
        else if(m==0)
            s=hours[h]+" "+minutes[m];
        else
            s=minutes[m]+" past "+hours[h];
                return s;
    }


}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

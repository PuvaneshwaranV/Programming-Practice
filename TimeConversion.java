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

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String period = s.substring(s.length() - 2); // Last 2 characters (AM or PM)
        String time = s.substring(0, s.length() - 2); // Time without AM/PM
        String[] timeParts = time.split(":");
        
        int hour = Integer.parseInt(timeParts[0]); // First part is the hour
        String minute = timeParts[1];
        String second = timeParts[2];
        
        // Convert hour to 24-hour format
        if (period.equals("AM")) {
            hour = (hour == 12) ? 0 : hour; // 12 AM is 00
        } else {
            hour = (hour == 12) ? 12 : hour + 12; // 12 PM remains 12
        }
        
        // Format hour as two digits
        String hour24 = String.format("%02d", hour);

        // Return the 24-hour formatted time
        return hour24 + ":" + minute + ":" + second;

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

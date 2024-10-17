import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            System.out.print(arr[i]);
            if (i != n - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
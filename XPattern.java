public class XPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j == (n - i + 1)) {
                    System.out.print((n - j + 1)+" ");
                } else {
                    System.out.print("  "); // Two spaces for alignment
                }
            }
            System.out.println();
        }
    }
}

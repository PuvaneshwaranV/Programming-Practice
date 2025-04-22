public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}

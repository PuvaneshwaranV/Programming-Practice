import java.util.*;

class SpiralMatrix {
    public static void main(String[] args) {
        int c = 0;
        int n = 9;
        int sq[][] = new int[n][n];
        for (int j = 0, i = 0; c != (n * n); j++, i++) {
            for (; j < n && sq[i][j] == 0;) {
                sq[i][j++] = ++c;
            }
            j--;
            i++;
            for (; i < n && sq[i][j] == 0;) {
                sq[i++][j] = ++c;
            }
            --i;
            j--;
            for (; j >= 0 && sq[i][j] == 0;) {
                sq[i][j--] = ++c;
            }
            ++j;
            --i;
            for (; i >= 0 && sq[i][j] == 0;) {
                sq[i--][j] = ++c;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sq[i][j] < 10)
                    System.out.print(sq[i][j] + "  ");
                else
                    System.out.print(sq[i][j] + " ");
            }
            System.out.println();
        }
    }
}
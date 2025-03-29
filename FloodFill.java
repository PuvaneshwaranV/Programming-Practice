import java.util.Arrays;

public class FloodFill {

    // Function to apply flood fill
    public static void floodFill(int[][] screen, int x, int y, int newColor) {
        int M = screen.length;
        int N = screen[0].length;
        int oldColor = screen[x][y];

        // If the old color is same as newColor, no need to change
        if (oldColor == newColor) return;

        // Start DFS fill
        fill(screen, x, y, oldColor, newColor, M, N);
    }

    // DFS helper function
    private static void fill(int[][] screen, int x, int y, int oldColor, int newColor, int M, int N) {
        // Boundary conditions
        if (x < 0 || x >= M || y < 0 || y >= N || screen[x][y] != oldColor) {
            return;
        }

        // Change color
        screen[x][y] = newColor;

        // Recur in 4 directions
        fill(screen, x + 1, y, oldColor, newColor, M, N); // Down
        fill(screen, x - 1, y, oldColor, newColor, M, N); // Up
        fill(screen, x, y + 1, oldColor, newColor, M, N); // Right
        fill(screen, x, y - 1, oldColor, newColor, M, N); // Left
    }

    // Function to print the screen
    private static void printScreen(int[][] screen) {
        for (int[] row : screen) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        // Input screen
        int[][] screen = {
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}
        };

        int x = 2, y = 4, newColor = 3;

        System.out.println("Original Screen:");
        printScreen(screen);

        // Apply Flood Fill Algorithm
        floodFill(screen, x, y, newColor);

        System.out.println("\nUpdated Screen:");
        printScreen(screen);
    }
}

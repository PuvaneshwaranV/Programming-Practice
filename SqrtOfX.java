class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; // The square root of 0 and 1 is the number itself
        }

        int left = 1, right = x / 2; // We search between 1 and x / 2
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;  // Use long to avoid overflow

            if (square == x) {
                return mid;  // If the square is exactly x, we found the square root
            } else if (square < x) {
                result = mid; // Store the potential result
                left = mid + 1;  // Search in the higher half
            } else {
                right = mid - 1;  // Search in the lower half
            }}
            return result;
    }
}
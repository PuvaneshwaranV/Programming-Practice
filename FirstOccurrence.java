class Solution {
    public int strStr(String haystack, String needle) {
        int k = 0, i = 0,p=0;
        for (i = 0; i <= haystack.length() - 1 && k != needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                k = 1;
                p = i + 1;
                while (k < needle.length() && p<haystack.length()) {
                    if (haystack.charAt(p++) != needle.charAt(k++)) {
                        k--;
                        p--;
                        break;
                    }
                }
                if (k == needle.length()) {
                    k = p - k;
                    return k;
                }
            }
        }
        if (k == needle.length()) {
            k = i - k;
            return k;
        } else
            return -1;
    }
}

public class FirstOccurrence {
    public static void main(String arg[]) {
        Solution s1 = new Solution();
        String haystack = "mississippi";
        String needle = "issipi";
        int k = s1.strStr(haystack, needle);
        System.out.println(k);

    }
}
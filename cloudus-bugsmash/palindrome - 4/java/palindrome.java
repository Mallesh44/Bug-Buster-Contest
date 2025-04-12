public class LongestPalindromeSubstring {

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }
        return right - left;
    }

    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.length() == 0)
            return null;

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i <= s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLen = len1 > len2 ? len2 : len1;

            if (maxLen >= maxLength) {
                start = i - maxLen / 2;
                maxLength = maxLen;
            }
        }

        return s.substring(start, start + maxLength + 1);
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubstring("babad"));
        System.out.println(longestPalindromeSubstring("cbbd"));
        System.out.println(longestPalindromeSubstring(""));
        System.out.println(longestPalindromeSubstring("a"));
        System.out.println(longestPalindromeSubstring("racecar"));
    }
}

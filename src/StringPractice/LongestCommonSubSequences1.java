package StringPractice;

public class LongestCommonSubSequences1 {


    static int lcsLength(String s1, String s2) {
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int m = s1.length(), n = s2.length();
        int[] prev = new int[n + 1];
        int[] curr = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    curr[j] = prev[j - 1] + 1;
                else
                    curr[j] = Math.max(prev[j], curr[j - 1]);
            }
            int[] temp = prev;
            prev = curr;
            curr = temp;
        }
        return prev[n];
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB";
        String s2 = "BDCAB";
        System.out.println("LCS length: " + lcsLength(s1, s2));
    }

}

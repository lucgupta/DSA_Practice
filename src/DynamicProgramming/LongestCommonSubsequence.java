package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    static int lcs(String s1, String s2, int m, int n) {
        int [][] table = new int[m+1][n+1];
        List<Character> lcs = new ArrayList<>();

        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    table[i][j] = 1 + table[i - 1][j - 1];
                    lcs.add(s1.charAt(i-1));
                }
                else
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
            }
        }
        for(int i = 0; i < lcs.size(); i++) {
            System.out.print(lcs.get(i));
        }
        System.out.println("\n");
        return table[m][n];
    }

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int m = s1.length();
        int n = s2.length();

        System.out.println(lcs(s1, s2, m, n));

    }
}

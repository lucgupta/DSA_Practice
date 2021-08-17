package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestRepeating {

    static int longestRepeating(String str, int n) {
        int [][] table = new int[n+1][n+1];

        List<Character> value = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(i != j && str.charAt(i-1) == str.charAt(j-1)) {
                    table[i][j] = 1 + table[i-1][j-1];
                    value.add(str.charAt(i-1));
                }
                else
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
            }
        }

        for(int i = 0; i < value.size(); i++)
            System.out.print(value.get(i));

        return table[n][n];
    }

    public static void main(String[] args) {
        String str = "AABEBCDD";
        int n  = str.length();

        System.out.println(longestRepeating(str, n));
    }
}

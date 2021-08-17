package DynamicProgramming;

public class PatternMatching {

    static boolean patternMatching(String pat, String str, int m, int n) {
        boolean [][] table = new boolean[m+1][n+1];

        for(int i = 0; i <= n; i++)
            table[0][i] = true;

        for(int i = 1; i <= m; i++)
            table[i][0] = false;

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(pat.charAt(i-1) == str.charAt(j-1))
                    table[i][j] = table[i-1][j-1];
                else
                    table[i][j] = table[i][j-1];
            }
        }
        return table[m][n];
    }

    public static void main(String[] args) {

        String pat = "AAB";
        String str = "ABBBA";

        int m = pat.length();
        int n = str.length();

        if (patternMatching(pat, str, m, n))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}

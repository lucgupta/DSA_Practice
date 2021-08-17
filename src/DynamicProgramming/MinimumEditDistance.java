package DynamicProgramming;

public class MinimumEditDistance {

    static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    static int editDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int [][] table = new int[n+1][m+1];

        for(int i = 0; i <= n; i++)
            table[i][0] = i;

        for(int i = 0; i <= m; i++)
            table[0][i] = i;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(str1.charAt(i-1) != str2.charAt(j-1)) {
                    table[i][j] =  1+ min(table[i][j-1], table[i-1][j], table[i-1][j-1]);
                }
                else
                    table[i][j] = table[i-1][j-1];
            }
        }

        return table[n][m];
    }

    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "abbbb";

        System.out.println(editDistance(str1, str2));
    }
}

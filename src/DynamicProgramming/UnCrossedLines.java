package DynamicProgramming;

public class UnCrossedLines {

    static int unCrossedLines(int []arr1, int []arr2, int m, int n) {
        int [][]table = new int[m+1][n+1];

        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(arr1[i-1] == arr2[j-1])
                    table[i][j] = 1 + table[i-1][j-1];
                else
                    table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
            }
        }
        return table[m][n];
    }

    public static void main(String[] args) {
        int []arr1 = {2, 3, 2, 4};
        int []arr2 = {2, 2, 3, 4};

        int m = arr1.length;
        int n = arr2.length;

        System.out.println(unCrossedLines(arr1, arr2, m, n));
    }
}

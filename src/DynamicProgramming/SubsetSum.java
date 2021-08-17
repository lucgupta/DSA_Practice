package DynamicProgramming;

public class SubsetSum {

    static boolean isSubsetSum(int[] set, int sum, int n) {
        boolean[][] table = new boolean[n+1][sum+1];

        for(int i = 0; i <= n; i++) {
            table[i][0] = true;
        }
        for(int i = 1; i <= sum; i++) {
            table[0][i] = false;
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                if(set[i-1] > j)
                    table[i][j] = table[i-1][j];
                else
                    table[i][j] = table[i-1][j] || table[i-1][j-set[i-1]];
            }
        }
        return table[n][sum];
    }

    public static void main(String[] args) {
        int set[] = { 3, 34, 4, 12, 5, 2 };
        int sum = 9;
        int n = set.length;
        if(isSubsetSum(set, sum, n))
            System.out.println("set is present");
        else
            System.out.println("set is missing");
    }
}

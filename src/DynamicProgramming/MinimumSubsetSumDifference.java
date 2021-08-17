package DynamicProgramming;

public class MinimumSubsetSumDifference {

    static int minimumDifference(int []set, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++)
            sum+= set[i];

        boolean[][] table = new boolean[n+1][sum+1];

        for(int i = 0; i <= n; i++)
            table[i][0] = true;
        for(int i = 1; i <= sum; i++)
            table[0][i] = false;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                if(set[i-1] > j)
                    table[i][j] = table[i-1][j];
                else
                    table[i][j] = table[i-1][j] || table[i-1][j-set[i-1]];
            }
        }

        int diff = Integer.MAX_VALUE;
        for(int i = 0; i <= sum/2; i++) {
            int first = i;
            int second = sum - i;

            if(table[n][i] && diff > Math.abs(first-second))
                diff = Math.abs(first-second);
        }

        return diff;
    }

    public static void main(String[] args) {
        int []set = {2, 4, 2, 3};
        int n = set.length;

        System.out.println(minimumDifference(set, n));
    }
}

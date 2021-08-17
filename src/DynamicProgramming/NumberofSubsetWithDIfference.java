package DynamicProgramming;

public class NumberofSubsetWithDIfference {

    static int numberOfSubset(int []set, int n, int diff) {
        int sum = 0;
        for(int i = 0; i < n; i++)
            sum+= set[i];

        sum = (sum + diff) / 2;

        int [][] table = new int[n+1][sum+1];

        for(int i = 0; i <= n; i++)
            table[i][0] = 1;
        for(int i = 1; i <= sum; i++)
            table[0][i] = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++){
                if(set[i-1] > j)
                    table[i][j] = table[i-1][j];
                else
                    table[i][j] = table[i-1][j] + table[i-1][j-set[i-1]];
            }
        }

        return table[n][sum];
    }

    public static void main(String[] args) {
        int []set = {1, 1, 1, 1, 1};
        int n = set.length;
        int diff = 3;

        System.out.println(numberOfSubset(set, n, diff));
    }
}

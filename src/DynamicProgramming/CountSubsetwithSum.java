package DynamicProgramming;

public class CountSubsetwithSum {

    static int countSubset(int []set , int sum, int n) {
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

//        for(int i = 0; i <= n; i++){
//            for(int j = 0; j <= sum; j++)
//                System.out.print(table[i][j] + " ");
//            System.out.println("\n");
//        }
        return table[n][sum];
    }

    public static void main(String[] args) {
        int []set = {1, 2, 1};
        int sum = 3;
        int n = set.length;
        System.out.println(countSubset(set, sum, n));
    }
}

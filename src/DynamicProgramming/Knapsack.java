package DynamicProgramming;

public class Knapsack {

    static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    static int knapsack(int[] wt, int[] val, int W, int n) {
        int [][] table = new int[n+1][W+1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= W; j++) {
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(wt[i-1] > j){
                    table[i][j] = table[i-1][j];
                }
                else {
                    table[i][j] = max(table[i-1][j], val[i-1]+table[i-1][j-wt[i-1]]);
                }
            }
        }
        return table[n][W];

    }

    public static void main(String[] args) {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;

        System.out.println(knapsack(wt, val, W, n));
    }
}

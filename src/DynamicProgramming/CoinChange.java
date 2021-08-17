package DynamicProgramming;

public class CoinChange {

    static int min(int a, int b) {
        return a < b ? a : b;
    }

    static int coinChange(int []arr, int amount, int n) {
        int [][] table = new int[n+1][amount+1];

        for(int i = 0; i <= n; i++) {
            table[i][0] = 1;
        }
        for(int i = 1; i <= amount; i++)
            table[0][i] = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= amount; j++) {

                if(arr[i-1] > j) {
//                    System.out.println("in if i : " + i + " j : " + j);
                    table[i][j] = table[i - 1][j];
                }
                else {
//                    System.out.println("in else i : " + i + " j : " + j);
//                    System.out.println(" for " + i + " first value is " + table[i - 1][j] + " second value is " + (1 + table[i][j - arr[i - 1]]));
                    table[i][j] = table[i - 1][j] + table[i][j - arr[i - 1]];
                }
            }
        }

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= amount; j++)
                System.out.print(table[i][j] + " ");
            System.out.println("\n");
        }

        return table[n][amount];
    }

    public static void main(String[] args) {
        int []arr = {1, 2, 5};
        int amount = 5;
        int n = arr.length;
        System.out.println(coinChange(arr, amount, n));
    }


}

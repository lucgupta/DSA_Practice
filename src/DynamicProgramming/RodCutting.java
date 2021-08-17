package DynamicProgramming;

public class RodCutting {

    static int rodCutting(int []rod, int []price, int length, int n) {

        int [][] table = new int[n+1][length+1];

        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= length; j++) {
                if(i == 0 || j == 0)
                    table[i][j] = 0;
                else if(rod[i-1] > j)
                    table[i][j] = table[i-1][j];
                else
                    table[i][j] = Math.max(table[i-1][j], price[i-1]+table[i][j-rod[i-1]]);

            }
        }
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= length; j++)
                System.out.print(table[i][j] + " ");
            System.out.println("\n");
        }

        return table[n][length];
    }

    public static void main(String[] args) {
        int []rod = {1, 2, 3, 4};
        int []price = {2, 5, 7, 8};
        int length = 5;

        int n = rod.length;
        System.out.println(rodCutting(rod, price, length, n));
    }
}

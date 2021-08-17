package DynamicProgramming;

public class UniquePaths {

    static int findUniquePathRecur(int x1, int y1, int x2, int y2) {

        if(x1 > 2 || y1> 2)
            return 0;

        if(x1 == x2 && y1 == y2)
            return 1;

        return (findUniquePathRecur(x1, y1+1, x2, y2) + findUniquePathRecur(x1+1, y1, x2, y2));
    }

    static int findUniquedp(int x1, int y1, int x2, int y2) {
        int [][] table = new int[x2+1][y2+1];

        table[0][0] = 0;

        for(int i = 1; i <= x2; i++)
            table[0][i] = 1;
        for(int i = 1; i <= y2; i++)
            table[i][0] = 1;

        for(int i = 1; i <= x2; i++) {
            for(int j = 1; j <= y2; j++) {
                table[i][j] = table[i-1][j] + table[i][j-1];
            }
        }

        return table[x2][y2];
    }

    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 2, y2 = 2;

        //recursive method
        System.out.println(findUniquePathRecur(x1, y1, x2, y2));

        //dp based
        System.out.println(findUniquedp(x1, y1, x2, y2));
    }
}

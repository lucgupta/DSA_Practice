package Arrays;

public class SpiralMatrix {

    public static void printSpiral(int[][] arr, int n, int m) {
        int left=0, top = 0, right = m-1, bottom = n-1;
        int direction = 0;

        while(left<=right && top <= bottom) {

            if(direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i]+ " ");
                }
                top++;
                direction = 1;
            }
            else if(direction == 1) {
                for(int i = top; i <=bottom; i++) {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
                direction = 2;
            }
            else if(direction == 2) {
                for(int i = right; i>=left; i--)
                    System.out.print(arr[bottom][i]+ " ");
                bottom--;
                direction = 3;
            }
            else if(direction == 3) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left]+ " ");
                }
                left++;
                direction = 0;
            }

        }
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int n = a.length;
        int m = a[0].length;

        printSpiral(a, n, m);
    }
}

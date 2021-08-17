package DynamicProgramming;

import java.util.Stack;

public class MaxRectangle {

    public static int findMaxRectangle(int []hist) {
        int n = hist.length;

        int []left = new int[n];
        int []right = new int[n];

        Stack<Integer> stack = new Stack<>();
        int max_area = 0;

        for(int i = 0; i < n; i++) {
            if(stack.empty()) {
                left[i] = 0;
                stack.push(i);
            }
            else {
                while (!stack.empty() && hist[i] <= hist[stack.peek()]) {
                    stack.pop();
                }

                left[i] = stack.empty() ? 0 : stack.peek() + 1;
                stack.push(i);
            }


        }
        while(!stack.empty())
            stack.pop();

        for(int i = n-1; i >= 0; i--) {
            if(stack.empty()) {
                right[i] = n - 1;
                stack.push(i);
            }
            else {
                while (!stack.empty() && hist[i] <= hist[stack.peek()])
                    stack.pop();

                right[i] = stack.empty() ? n - 1 : stack.peek() - 1;
                stack.push(i);
            }
        }

        for(int i = 0; i < n; i++) {
            if(max_area < (right[i] - left[i] + 1) * hist[i])
                max_area = (right[i] - left[i] + 1) * hist[i];
        }

        return max_area;
    }

    public static int maxRectangle(int [][]A, int row, int col) {
        int []temp = new int[col];
        int max_rectangle = 0;
        for(int i = 0; i < col; i++)
            temp[i] = 0;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j ++) {
                if(A[i][j] == 1)
                    temp[j] = temp[j] + A[i][j];
                else
                    temp[j] = 0;
            }
            int sum = findMaxRectangle(temp);
            if(max_rectangle < sum)
                max_rectangle = sum;
        }
        return max_rectangle;
    }

    public static void main(String[] args) {
        int R = 4;
        int C = 4;

        int A[][] = {
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 },
        };
        System.out.println(maxRectangle(A, R, C));
    }
}

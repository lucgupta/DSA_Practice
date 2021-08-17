package Stack;

import java.util.Stack;

public class LargestRectangle {

    static int largestRectangle(int []hist) {
        int n = hist.length;

        int []left = new int[n];
        int []right = new int[n];

        Stack<Integer> stack = new Stack<>();
        int max_area = 0;

        for(int i = 0; i < n; i++) {
            if(stack.empty()) {
//                System.out.println("yes " + i);
                left[i] = 0;
                stack.push(i);
            }
            else {
//                System.out.println(stack.peek());
                while (!stack.empty() && hist[i] <= hist[stack.peek()]) {
//                    System.out.println(stack.peek());
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

        for(int i = 0; i < n; i++)
            System.out.print(left[i] + " ");

        System.out.println();
        for(int i = 0; i < n; i++)
            System.out.print(right[i] + " ");

        for(int i = 0; i < n; i++) {
            if(max_area < (right[i] - left[i] + 1) * hist[i])
                max_area = (right[i] - left[i] + 1) * hist[i];
        }

        return max_area;
    }

    public static void main(String[] args) {
        int []arr = {2, 1, 5, 6, 2, 3};

        System.out.println(largestRectangle(arr));
    }
}

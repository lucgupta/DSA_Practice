package DynamicProgramming;

public class ReduceXto0 {

    static int reduceXto0(int []nums, int X, int L, int R, int count) {
        if(X == 0) {
            return count;
        }

        if(L > R)
            return 1000;

        return Math.min(reduceXto0(nums, X-nums[L], L+1,  R, count+1),
                reduceXto0(nums, X-nums[R], L, R-1, count+1));
    }

    public static void main(String[] args) {
        int []nums = {1, 1, 4, 2, 3};
        int X = 5;

        System.out.println(reduceXto0(nums, X, 0, nums.length-1, 0));
    }
}

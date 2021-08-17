package Arrays;

import java.util.HashMap;

public class SubarraySumEqualK {

    static int findSubarraySum(int arr[], int n, int sum) {

        HashMap<Integer, Integer> prevSum = new HashMap<>();

        int res = 0;
        int currsum = 0;

        for (int i = 0; i < n; i++) {
            currsum += arr[i];

            if (currsum == sum)
                res++;

            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);

            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 2, -3, 1, 4, 2, 1};
        int sum = 7;
        int n = arr.length;
        System.out.println(findSubarraySum(arr, n, sum));
    }

}


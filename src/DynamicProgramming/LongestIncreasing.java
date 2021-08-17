package DynamicProgramming;

public class LongestIncreasing {

    static int longestIncreasing(int []arr, int n) {
        int [] table = new int[n];

        for(int i = 0; i < n; i++)
            table[i] = 1;

        for(int i = 1; i <n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j])
                    table[i] = Math.max(table[j] + 1, table[i]);
            }
        }

        return table[n-1];
    }

    public static void main(String[] args) {
        int [] arr = {5, 8, 7, 2, 3, 4};

        int n = arr.length;

        System.out.println(longestIncreasing(arr, n));
    }
}

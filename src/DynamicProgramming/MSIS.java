package DynamicProgramming;

public class MSIS {

    static int maximumSumSubsequence(int []arr, int n) {
        int [] table = new int[n];

        for(int i = 0; i < n; i++)
            table[i] = arr[i];


        for(int i = 1; i <n ; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && table[i] < table[j] + arr[i])
                    table[i] = table[j] + arr[i];
            }
        }

        int maxx = 0;
        for(int i = 0; i < n; i++) {
            if (table[i] > maxx)
                maxx = table[i];
        }

        return maxx;
    }

    public static void main(String[] args) {
        int []arr = {1, 100, 3, 2, 6};

        int n = arr.length;

        System.out.println(maximumSumSubsequence(arr, n));
    }
}

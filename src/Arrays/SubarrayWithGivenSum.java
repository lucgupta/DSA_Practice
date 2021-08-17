package Arrays;

class SubarrayWithGivenSum {

    int subArraySum(int arr[], int n, int sum){
        int curr_sum = arr[0], start = 0, i;
        for(i = 1; i <= n; i++){
            while(curr_sum > sum && start < i - 1){
                curr_sum -= arr[start];
                start++;
            }
            if(curr_sum == sum){
                int p = i - 1;
                System.out.println("found index " + start + " and " + p);
                return 1;
            }
            if(i < n)
                curr_sum += arr[i];
        }
        System.out.println("No subarray was found");
        return 0;

    }


    public static void main(String[] args) {
        SubarrayWithGivenSum arraySum = new SubarrayWithGivenSum();
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        int n = arr.length;
        arraySum.subArraySum(arr, n, sum);
    }
}

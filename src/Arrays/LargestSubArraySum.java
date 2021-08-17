package Arrays;

public class LargestSubArraySum {

    void findLargestSum(int arr[], int n){
        int max_so_far = 0, max__ending = 0;
        for(int i = 0; i < n; i++){
            max__ending += arr[i];
            if(max_so_far < max__ending){
                max_so_far = max__ending;
            }
            if(max__ending < 0)
                max__ending = 0;
        }
        System.out.println(max_so_far);
    }

    public static void main(String[] args) {
        LargestSubArraySum arraySum = new LargestSubArraySum();
        int arr[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
        arraySum.findLargestSum(arr, n);
    }
}

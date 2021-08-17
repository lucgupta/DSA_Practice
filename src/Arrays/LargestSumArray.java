package Arrays;

public class LargestSumArray {

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int max_ending = 0, max_sum = 0;
        for(int i = 0; i < arr.length; i++) {
            max_ending += arr[i];
            if(max_ending < 0)
                max_ending = 0;
            else if(max_sum < max_ending)
                max_sum = max_ending;
        }
        System.out.println(max_sum);
    }
}

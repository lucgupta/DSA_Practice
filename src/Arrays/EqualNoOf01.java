package Arrays;

import java.util.HashMap;
import java.util.Map;

public class EqualNoOf01 {

    static void maxLen01(int []arr, int n) {

        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++) {
            arr[i] = arr[i] == 0 ? -1 : 1;
        }

        int sum = 0, max_len = 0, end_ind = -1;
        int start_ind = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum == 0) {
                max_len = i+1;
                end_ind = i;
            }

            if(hm.containsKey(sum)) {
                if(max_len < i-hm.get(sum)) {
                    max_len = i - hm.get(sum);
                    end_ind = i;
                }
            }
            else
                hm.put(sum, i);
        }

        start_ind = end_ind - max_len + 1;
        System.out.println(start_ind + " to " + end_ind);
    }

    public static void main(String[] args) {
        int []arr = {1, 0, 0, 1, 0, 1, 1};

        int n = arr.length;

        maxLen01(arr, n);
    }
}

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class PerfectSubarray {
    public static void main(String[] args) {
        int []arr = {3, 4, 5, 4};
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();

        mp.put(0, 1);
        int curr_sum = 0;
        int res = 0;
        int min_sum = 0;

        for(int i = 0; i < n; i++) {
            curr_sum += arr[i];
            min_sum = Math.min(min_sum, curr_sum);
            for(int j = 0; (curr_sum - j*j) >= min_sum; j++) {
                if(mp.containsKey(curr_sum-j*j))
                    res += mp.get(curr_sum-j*j);
            }
            Integer count = mp.get(curr_sum);
            if(count == null)
                mp.put(curr_sum, 1);
            else
                mp.put(curr_sum, count+1);

        }
        System.out.println(res);
    }
}

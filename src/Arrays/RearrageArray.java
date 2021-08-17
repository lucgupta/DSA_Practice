package Arrays;
import java.util.*;

public class RearrageArray {

    public static void rearrange(int[] arr, int n){
        int[] temp = arr.clone();
        int left = 0;
        int right = n-1;
        boolean flag = true;

        for(int i = 0; i < n; i++){
            if(flag)
                arr[i] = temp[right--];
            else
                arr[i] = temp[left++];
            flag = !flag;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("before rearrage array:");
        System.out.println(Arrays.toString(arr));
        rearrange(arr, arr.length);
        System.out.println("After rearrage array:");
        System.out.println(Arrays.toString(arr));
    }
}

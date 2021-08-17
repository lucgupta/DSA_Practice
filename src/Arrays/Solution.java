package Arrays;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            if (i >= A.size() - B)
                ret.add(A.get(i + B - A.size()));
            else
                ret.add(A.get(i + B));
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        int b = 2;
        ArrayList<Integer> rot = obj.rotateArray(arr, b);
        for (int i = 0; i < rot.size(); i++) {
            System.out.println(rot.get(i) + " ");
        }
    }
}

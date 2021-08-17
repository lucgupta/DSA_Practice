package DynamicProgramming;

import java.util.Arrays;

public class RussianDoll {

    static class Box implements Comparable<Box> {
        int w, h;

        public Box(int w, int h){
            this.w = w;
            this.h = h;
        }

        public int compareTo(Box o) {
            if(o.h < this.h || o.w < this.w )
                return 1;
            return -1;
        }
    }

    static int russianDoll(Box []arr, int n) {
        int []table = new int[n];

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            table[i] = 1;
        }

        table[0] = 1;
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i].w > arr[j].w && arr[i].h > arr[j].h && table[i] <= table[j] + 1) {
                    table[i] = 1 + table[j];
                }
            }
        }

        return table[n-1];
    }

    public static void main(String[] args) {
        Box []arr = new Box[4];

        arr[0] = new Box(5, 4);
        arr[1] = new Box(6, 4);
        arr[2] = new Box(6, 7);
        arr[3] = new Box(2,3);

        int n = arr.length;
        System.out.println(russianDoll(arr, n));



    }
}

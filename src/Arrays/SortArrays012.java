package Arrays;

public class SortArrays012 {

//    public static void sort012(int arr[], int length) {
//        int count1 = 0, count2 = 0, count3 = 0;
//
//        for(int i = 0; i < length; i++) {
//            if(arr[i] == 0)
//                count1++;
//            else if(arr[i] == 1)
//                count2++;
//            else
//                count3++;
//        }
//
//        int i = 0;
//            while(count1 > 0) {
//                arr[i] = 0;
//                count1--;
//                i++;
//            }
//            while(count2 > 0) {
//                arr[i] = 1;
//                count2--;
//                i++;
//            }
//            while(count3 > 0) {
//                arr[i] = 2;
//                count3--;
//                i++;
//            }
//        }

    public static void main(String[] args) {
        //input is - {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}

        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        int length = arr.length;

        for(int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

//        sort012(arr, length);

        //efficient method

        int low = 0, mid = 0, high = length-1, temp = 0;

        while(mid <= high) {
            if(arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1)
                mid++;
            else {
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }

        }

        System.out.println("After sorting");
        for(int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

    }
}

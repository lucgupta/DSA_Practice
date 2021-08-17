package Arrays;

public class MergeTwoSorted {

    public static void mergeTwoSortedArrays(int[] arr, int[] brr, int n1, int n2, int[] crr){
        int i = 0, j = 0, k = 0;
        while(i < n1 && j < n2){
            if(arr[i] < brr[j]){
                crr[k++] = arr[i++];
            }
            else{
                crr[k++] = brr[j++];
            }

        }
        while(i< n1){
            crr[k++] = arr[i++];
        }
        while(j < n2)
            crr[k++] = brr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int n1 = arr.length;
        int[] brr = {2, 4, 6, 8};
        int n2 = brr.length;
        int[] crr = new int[n1 + n2];
        mergeTwoSortedArrays(arr, brr, n1, n2, crr);
        for(int i = 0; i < n1+n2; i++)
            System.out.println(crr[i] + " ");
    }
}

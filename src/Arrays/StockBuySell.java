package Arrays;

public class StockBuySell {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};

        int n = arr.length;
        int total = 0;
        if(n==1)
            System.out.println("not applicable");

        for(int i = 0; i < n-1; i++) {
            while(i < n-1 && arr[i] > arr[i+1]) {
                i++;
            }
            int buy = arr[i];
            while(i <  n-1 && arr[i] < arr[i+1]) {
                i++;
            }
            int sell = arr[i];

            total += sell-buy;
        }
        System.out.println(total);
    }
}

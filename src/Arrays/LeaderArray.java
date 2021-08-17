package Arrays;

public class LeaderArray {

    void findLeader(int[] arr, int n){
        int max_ele = arr[n-1];
        System.out.println(max_ele + " ");
        for(int i = n-2; i >= 0; i--){
            if(max_ele < arr[i]){
                max_ele = arr[i];
                System.out.println(max_ele + " ");
            }
        }
    }

    public static void main(String[] args) {
        LeaderArray leaderArray = new LeaderArray();
        int[] arr = new int[] {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        leaderArray.findLeader(arr, n);
    }
}

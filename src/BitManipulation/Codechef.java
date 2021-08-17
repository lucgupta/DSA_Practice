package BitManipulation;

import java.util.Scanner;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0) {
            int N=scan.nextInt();
            int K=scan.nextInt();
            long []A = new long[N];
            for(int i = 0; i < N; i++)
                A[i] = scan.nextInt();

            int total = 0;
            for(int i = 0; i < 5; i++) {
                int count1 = 0;
                for(int j = 0; j < N; j++) {
                    if ((A[j] & (1 << i)) != 0) {
                        count1++;
                    }
                }
                System.out.println(count1);
                total += (count1 % K) == 0 ? (count1 / K) : (count1 / K) + 1;
                System.out.println("total is : " + total);
            }
            System.out.println(total);
        }
    }
}

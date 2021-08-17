package Arrays;

import java.util.Scanner;

public class NextGreaterElement {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int []arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int []ans = new int[n];
            boolean vis[] [] = new boolean[100][100];
            int pos = 1;
            for(int i = 0; i < n; i++) {
                if(pos <= k) {
                    ans[i] = pos;
                    vis[pos][arr[i]] = true;
                    pos++;
                }
                else {
                    int j;
                    for(j = 1; j <= k; j++) {
                        if(!vis[j][arr[i]]) {
                            ans[i] = j;
                            vis[j][arr[i]] = true;
                            break;
                        }
                    }
                    if(j > k) {
                        ans[i] = 0;
                    }
                }
            }
            for(int i = 0; i < n; i++) {
                System.out.println(ans[i]);
            }
            t--;
        }
    }
}

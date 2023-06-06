import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] format = br.readLine().split(" ");
            int H = Integer.parseInt(format[0]);
            int W = Integer.parseInt(format[1]);
            int N = Integer.parseInt(format[2]);
            int[][] arr = new int[H][W];
            int cnt = 0; int res = 0;
            int temp = 0;

            for(int j=0; j<W; j++){
                cnt++;
                for (int k=H-1; k>=0; k--){
                    arr[k][j] = ((H-k) * 100) + cnt;
                    temp = arr[k][j];
                    res++;
                    if (res == N){
                        System.out.println(temp);
                        break;
                    }
                }
            }
        }
        br.close();
    }
}

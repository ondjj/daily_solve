import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int lt = 0, rt = n-1, result = Integer.MAX_VALUE;
        while(lt <= rt){
            int mid = (lt+rt)/2;
            if (mid >= arr.length || arr[mid] > k) break;

            int coin = 0;
            int temp = k;

            while(temp > 0){
                if (arr[mid]<=temp){
                    coin += temp/arr[mid];
                    temp = (temp%arr[mid]);
                }else {
                    mid--;
                }
            }
            result = Math.min(result, coin);
            lt++;
        }

        System.out.println(result);
        bw.close();
        br.close();
    }
}

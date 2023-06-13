import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int k = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        int[] arr = new int[k];
        
        long max = 0;
        
        for (int i = 0; i < k; i++) {
            int lan = Integer.parseInt(br.readLine());
            arr[i] = lan;
            if (max < arr[i]){
                max = arr[i];
            }
        }
        max++;
        
        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;
            long count = 0;

            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if (count < N) {
                max = mid;
            }else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}

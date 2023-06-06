import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");

        for (int i=0; i<N; i++){
            map.put(A[i], 1);
        }

        int M = Integer.parseInt(br.readLine());
        String[] B = br.readLine().split(" ");
        for (int i=0; i<M; i++){
            if (map.containsKey(B[i])){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
        br.close();
    }
}

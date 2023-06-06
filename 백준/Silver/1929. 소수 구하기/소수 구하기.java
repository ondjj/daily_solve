import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] T = br.readLine().split(" ");
        int start = Integer.parseInt(T[0]);
        int end = Integer.parseInt(T[1]);

        int[] prime = new int[1000001];
        prime[0] = prime[1] = 1;

        for(int i=2; i<prime.length; i++){
            if (prime[i] == 0){
                for (int j=i+i; j<prime.length; j=j+i){
                    prime[j] = 1;
                }
            }
        }

        for(int i=start; i<=end; i++){
            if (prime[i] < 1){
                System.out.println(i);
            }
        }


        br.close();
    }
}

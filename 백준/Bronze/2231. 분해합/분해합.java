import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int origin = Integer.parseInt(N);
        int answer = 0;
        for (int i = 0; i < origin; i++) {
            int number = i;
            int sum = 0;

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if (sum + i == origin) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}

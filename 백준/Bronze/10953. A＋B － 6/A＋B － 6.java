import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] temp = br.readLine().split(",");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            System.out.println(a+b);
        }

        br.close();
    }
}

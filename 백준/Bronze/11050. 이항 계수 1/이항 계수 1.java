import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int binomial(int n, int r) {
        if (r==0 || n==r) return 1;
        return binomial(n-1,r-1) + binomial(n-1,r);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        System.out.println(binomial(N, K));
        br.close();
    }
}

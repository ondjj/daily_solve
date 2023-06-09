import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int count = 1; // 현재까지 찾은 종말의 수 개수
        int num = 666; // 시작 수 (666 이전 수)

        while (count != N) {
            num++;
            if (hasTripleSix(num)) {
                count++;
            }
        }
        System.out.println(num);
    }
    private static boolean hasTripleSix(int num) {
        String strNum = Integer.toString(num);
        return strNum.contains("666");
    }
}

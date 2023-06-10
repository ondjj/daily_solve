import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        int cnt = 0;

        for (int i = 5; i <= N; i *= 5) {
            cnt += N/i;
        }
        System.out.println(cnt);
        // 10 x 9 x 8 x 7 x 6 x 5 x 4 x 3 x 2 x 1

    }
}

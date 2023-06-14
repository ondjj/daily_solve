import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int roomCount = 1;  // N번 방을 지날 때까지 지나가는 방의 개수
        int roomLayer = 1;  // 현재 층

        while (N > 1) {
            // 다음 층으로 이동할 때마다 방의 개수는 6의 배수로 증가
            roomCount += 6 * roomLayer;
            roomLayer++;

            // N이 해당 층의 범위에 속하면 종료
            if (N <= roomCount) {
                break;
            }
        }

        System.out.println(roomLayer);
    }
}

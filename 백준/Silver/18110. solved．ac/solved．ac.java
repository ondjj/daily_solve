import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double ratio = 0.15;
        int[] level = new int[N];
        int topCount = (int) Math.round(level.length * ratio);
        int downCount = level.length - topCount;
        double sum = 0;
        for (int i = 0; i < level.length; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(level);
        for (int i = topCount; i < downCount; i++) {
            sum += level[i];
        }

        if (downCount == 0 || sum == 0){
            System.out.println(0);
        }else {
            int customAvg = (int) Math.round(sum/(N-topCount*2));
            System.out.println(customAvg);
        }
    }
}

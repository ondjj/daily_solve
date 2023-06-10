import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp == 0) arr.remove(arr.size()-1);
            else arr.add(temp);
        }
        int sum = 0;
        for(int x : arr) sum += x;

        System.out.println(sum);

    }
}

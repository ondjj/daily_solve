import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static class Online{
        int age;
        String name;

        public Online() {
        }

        public Online(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge(){
            return this.age;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Online> judge = new ArrayList<>();

        for (int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            String K = str[1];
            judge.add(new Online(A, K));
        }

        List<Online> answer = judge.stream()
                .sorted(Comparator.comparing(Online::getAge))
                .collect(Collectors.toList());

        for (Online x : answer) {
            System.out.println(x.age + " " + x.name);
        }
        br.close();
    }
}

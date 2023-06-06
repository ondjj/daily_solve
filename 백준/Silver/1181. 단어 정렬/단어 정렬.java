import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> words = new ArrayList<>();
        for (int i=0; i<N; i++){
            words.add(br.readLine());
        }

        List<String> sorted = words.stream()
                        .distinct()
                                .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                                        .collect(Collectors.toList());
        for (String word : sorted){
            System.out.println(word);
        }

        br.close();
    }
}

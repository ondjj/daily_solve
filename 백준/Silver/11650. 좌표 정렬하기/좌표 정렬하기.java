import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static class xy{
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<xy> arr = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            xy target = new xy(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            arr.add(target);
        }

        List<xy> sortedList = arr.stream()
                        .sorted(Comparator.comparingInt(xy::getX).thenComparingInt(xy::getY))
                                .collect(Collectors.toList());

        for (xy x : sortedList){
            System.out.println(x.getX() + " " + x.getY());
        }

        br.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static class XY{
        int x;
        int y;

        public XY(int x, int y){
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
        int N = Integer.parseInt(br.readLine());
        List<XY> arr = new ArrayList<>();

        for (int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            XY target = new XY(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            arr.add(target);
        }

        List<XY> sortedArr = arr.stream()
                .sorted(Comparator.comparingInt(XY::getY)
                        .thenComparingInt(XY::getX))
                        .collect(Collectors.toList());

        for(XY T : sortedArr){
            System.out.println(T.getX() + " " + T.getY());
        }
        br.close();
    }
}

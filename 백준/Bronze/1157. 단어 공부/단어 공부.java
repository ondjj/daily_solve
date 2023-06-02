import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Alphabet = in.nextLine().toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<Alphabet.length(); i++){
            map.put(Alphabet.charAt(i), map.getOrDefault(Alphabet.charAt(i), 0)+1);
        }
        Character maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if (value == maxValue){
                maxKey = '?';
            }
            else if (maxValue < value){
                maxValue = value;
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);

        in.close();
    }
}

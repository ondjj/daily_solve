import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static class Deck{
        int data;
        List<Deck> arr = new ArrayList<>();

        public Deck(){
        }

        public Deck(int n){
            this.data = n;
        }

        public void push_back(int n){
            Deck deck = new Deck(n);
            this.arr.add(deck);
        }

        public void push_front(int n) {
            Deck deck = new Deck(n);
            List<Deck> temp = new ArrayList<>(this.arr);
            this.arr.clear();
            this.arr.add(deck);
            this.arr.addAll(temp);
        }

        public int pop_front(){
            if (this.arr.isEmpty()) return -1;

            int value = this.arr.get(0).data;
            this.arr.remove(0);

            return value;
        }

        public int pop_back(){
            if (this.arr.isEmpty()) return -1;

            int value = this.arr.get(arr.size()-1).data;
            this.arr.remove(this.arr.get(arr.size()-1));
            return value;
        }

        public int size(){
            return this.arr.size();
        }

        public int empty(){
            if (this.arr.isEmpty()) return 1;
            else return 0;
        }

        public int front(){
            if (this.arr.isEmpty()) return -1;
            else{
                return this.arr.get(0).data;
            }
        }

        public int back(){
            if (this.arr.isEmpty()) return -1;
            else{
                return this.arr.get(arr.size()-1).data;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deck deck = new Deck();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "push_back":
                    deck.push_back(Integer.parseInt(str[1]));
                    break;
                case "push_front":
                    deck.push_front(Integer.parseInt(str[1]));
                    break;
                case "front":
                    System.out.println(deck.front());
                    break;
                case "back":
                    System.out.println(deck.back());
                    break;
                case "empty":
                    System.out.println(deck.empty());
                    break;
                case "pop_front":
                    System.out.println(deck.pop_front());
                    break;
                case "pop_back":
                    System.out.println(deck.pop_back());
                    break;
                case "size":
                    System.out.println(deck.size());
                    break;
            }
        }
        br.close();
    }
}

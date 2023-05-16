import java.util.*;

class Solution {
    static int[] check;
    static int score;
    
    public int solution(int[] cards) {
        int answer = 0;
        int cardLen = cards.length;
        check = new int[cardLen + 1];
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<cardLen; i++){
            if(check[i+1] == 0){
                score = 1;
                check[i+1] = 1;
                game(cards[i], cards);
                arr.add(score);
            }
        }
        if(arr.size()<2){
            return 0;
        }
        Collections.sort(arr, Collections.reverseOrder());
        answer = arr.get(0) * arr.get(1);
        return answer;
    }
    
    public void game(int card, int[] cards){
        if(check[card] == 0){
            check[card] = 1;
            score += 1;
            game(cards[card-1], cards);
        }
    }
}
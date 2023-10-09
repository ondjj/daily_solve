import java.util.ArrayList;

public class Solution {
    static int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
    };
    public int[] solution(int[] answers) {
        int[] answer;
        int[] correct = correctCount(pattern, answers);
        int max = Math.max(correct[0], Math.max(correct[1], correct[2]));
        
        ArrayList<Integer> aList = isTie(max, correct);

        answer = new int[aList.size()];

        for (int i = 0; i < answers.length; i++) {
            answer[i] = aList.get(i);
        }
        return answer;
    }

    private ArrayList<Integer> isTie(final int max, int[] correct) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < correct.length; i++) {
            if (correct[i] == max){
                arr.add(i + 1);
            }
        }
        return arr;
    }

    private int[] correctCount(final int[][] arr, final int[] answers) {
        int[] temp = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (arr[i][j % arr[i].length] == answers[j]) temp[i]++;
            }
        }
        return temp;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> releaseList = new ArrayList();

        for (int i = progresses.length - 1; i >= 0; i--) {
            int remainingDays = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                remainingDays++;
            }

            stack.push(remainingDays);
        }

        while (!stack.isEmpty()) {
            int count = 1;
            int top = stack.pop();

            while (!stack.isEmpty() && top >= stack.peek()) {
                stack.pop();
                count++;
            }

            releaseList.add(count);
        }

        int[] result = new int[releaseList.size()];
        for (int i = 0; i < releaseList.size(); i++) {
            result[i] = releaseList.get(i);
        }

        return result;
    }
}



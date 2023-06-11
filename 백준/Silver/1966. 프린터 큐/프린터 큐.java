import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static class CustomQue{
        int idx;
        int data;
        boolean target;

        public CustomQue(int idx, int data, boolean target) {
            this.idx = idx;
            this.data = data;
            this.target = target;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 전체 반복 횟 수
        while (T-- > 0){
            // 같은 숫자가 들어올 경우 구분하기 위해 CustomQue 객체 타입을 받음
            Queue<CustomQue> que = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int papers = Integer.parseInt(st.nextToken()); // 전체 페이퍼 수
            int position = Integer.parseInt(st.nextToken()); // 출력 순서를 찾고자 하는 페이퍼 위치
            st = new StringTokenizer(br.readLine(), " ");
            
            // Q와 매칭될 ArrayList
            ArrayList<Integer> arr = new ArrayList<>();
            
            for (int i=0; i<papers; i++){
                int temp = Integer.parseInt(st.nextToken());
                arr.add(temp);
                CustomQue cq;
                if (position == i){
                    cq = new CustomQue(i, temp, true);
                }else {
                    cq = new CustomQue(i, temp, false);
                }
                que.offer(cq);
            }
            // 내림 차순 정렬로 0번째 값을 찾을 경우 삭제
            Collections.sort(arr);
            Collections.reverse(arr);
            
            int i = 0;
            int cnt = 1;
            while (!que.isEmpty()) {
                if (arr.get(i) == que.peek().data && que.peek().target) {
                    System.out.println(cnt);
                    break;
                } else if (arr.get(i) == que.peek().data && !que.peek().target) {
                    cnt++;
                    que.poll();
                    arr.remove(i);
                } else {
                    CustomQue td = que.poll();
                    que.offer(td);
                }
            }
        }
        br.close();
    }
}

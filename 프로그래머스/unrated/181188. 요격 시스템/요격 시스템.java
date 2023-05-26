// 개구간 : 수직선 위에서 두 실수 a, b가 a＜b일 때 부등식 a＜x＜b를 만족하는 실수 x의 집합
import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        //e 기준 오름차순 정렬
        Arrays.sort(targets, (o1, o2)->(o1[1]-o2[1]));
        
        // for(int[] x : targets){
        //     for(int y : x){
        //         System.out.print(y+" ");
        //     }
        //     System.out.println();
        // }
        
        int pos = Integer.MIN_VALUE;
        
        for(int[] t:targets){
            if(pos<t[0]){
                pos = t[1]-1; // 개구간에 포함되려면 t[1] 값보다 작아야된다.
                answer++; 
            }
            
        }
        return answer;
    }
}
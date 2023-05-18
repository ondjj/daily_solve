import java.util.Arrays;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        // 주어진 정렬 조건에 따라 data 배열을 정렬
        Arrays.sort(data, (a, b) -> {
            if (a[col - 1] == b[col - 1]) { // col번째 컬럼 값이 동일한 경우
                return b[0] - a[0]; // 기본키인 첫 번째 컬럼 값을 기준으로 내림차순 정렬
            } else {
                return a[col - 1] - b[col - 1]; // col번째 컬럼 값을 기준으로 오름차순 정렬
            }
        });

        int hashValue = 0;
        
        for (int i = row_begin - 1; i < row_end; i++) {
            int s_i = 0;
            // i번째 행의 각 컬럼 값을 i로 나눈 나머지를 계산하여 s_i에 누적
            for (int j = 0; j < data[i].length; j++) {
                s_i += data[i][j] % (i + 1);
            }
            // 계산된 s_i 값을 해시 값에 XOR 연산을 수행하여 누적
            hashValue ^= s_i;
        }

        return hashValue; // 최종적인 해시 값 반환
    }
}

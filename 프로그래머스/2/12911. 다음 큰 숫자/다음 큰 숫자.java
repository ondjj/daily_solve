public class Solution {
    public int solution(int n) {
        int n1 = numsOfOne(n);
        while (n1 != numsOfOne(++n));
        return n;
    }

    private int numsOfOne(final int n) {
        return Integer.bitCount(n);
    }
}

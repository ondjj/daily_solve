public class Solution {

    public boolean solution(int x) {
        int s1 = sumOfDigits(x);
        return x % s1 == 0;
    }

    private int sumOfDigits(final int x) {
        int sum = 0;

        for (char ch : String.valueOf(x).toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
}

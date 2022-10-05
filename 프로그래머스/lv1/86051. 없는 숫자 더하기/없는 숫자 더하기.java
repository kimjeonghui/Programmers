import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45;
        answer = sum - Arrays.stream(numbers).sum();
        return answer;
    }
}
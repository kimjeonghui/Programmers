import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer[] newArr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr, Collections.reverseOrder());
        answer = newArr[0] * newArr[1];
        //Arrays.sort(numbers);
        //answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        return answer;
    }
}
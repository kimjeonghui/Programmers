import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length; j++){
                int k = numbers[i]+numbers[j];
                if(!list.contains(k)){
                    list.add(k);
                }
            }
        }
        Collections.sort(list);
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
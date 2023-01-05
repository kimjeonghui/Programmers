import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=1; i<=n; i++){
            int j =n;
            if(j% i== 0){
                j /= i;
                list.add(i);
                //list.add(j);
            }
        }
        Collections.sort(list);
        answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
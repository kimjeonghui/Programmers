
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        ArrayList<Integer> idx= (ArrayList<Integer>) Arrays.stream(emergency).boxed().collect(Collectors.toList());
        
        ArrayList<Integer> sort= (ArrayList<Integer>) Arrays.stream(emergency).boxed().collect(Collectors.toList());
        Collections.sort(sort, Collections.reverseOrder());
        for(int i=0; i<emergency.length; i++){
            answer[i] = (sort.indexOf(idx.get(i))+1);
        }
        return answer;
    }
}
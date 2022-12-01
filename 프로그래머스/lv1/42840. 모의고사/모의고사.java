import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> p1 = Arrays.asList(1,2,3,4,5);
         List<Integer> p2 = Arrays.asList(2,1,2,3,2,4,2,5);
         List<Integer> p3 = Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5);
        int cnt=0;
        int cnt2 = 0;
        int cnt3 =0;
        for(int i=0; i<answers.length; i++){
            if(p1.get(i%5) == answers[i]) cnt++;
            if(p2.get(i%8) == answers[i]) cnt2++;
            if(p3.get(i%10) == answers[i]) cnt3++;
        }
        
        int max = Arrays.stream(new int[]{cnt, cnt2, cnt3}).max().getAsInt();
        
        List<Integer> result = new ArrayList<>();
        if(max == cnt) result.add(1);
        if(max == cnt2) result.add(2);
        if(max == cnt3) result.add(3);
        
        int[] answer = result.stream()
                .mapToInt(i -> i)
                .toArray();
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        //큐
        //이중반복문
        //뒤에서 두번째는 무조건 1
        //뒤에서 마지막은 무조건 0
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<prices.length; i++){
            if( i == prices.length-1){
                result.add(0);
                break;
            }
            if( i == prices.length-2){
                result.add(1);
                continue;
            }
            int cnt =0;
            for(int j =i+1; j<prices.length; j++){
                if(prices[i] <= prices[j]) cnt++;
                else{
                    cnt++;
                    break;
                }
            }
            result.add(cnt);
        }
        int[] answer = result.stream()
            .mapToInt( i -> i)
            .toArray();
        
        return answer;
    }
}
import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        //순서바꾸기 배열과 맵 동시에
        for(int i=0; i<callings.length; i++){
            int temp = map.get(callings[i]);
            String tempPlayer = answer[temp-1];
            answer[temp-1] = callings[i];
            answer[temp] = tempPlayer;
            
            map.replace(tempPlayer, Integer.valueOf(temp));
            map.replace(callings[i], Integer.valueOf(temp-1));
        
        }
        
        
        return answer;
    }
}
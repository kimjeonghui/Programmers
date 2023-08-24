import java.util.*;
class Solution {
    int answer = 0;
    public int solution(String s) {
        boolean[] visited = new boolean[s.length()];
        for(int i=0; i<s.length(); i++){
            if(visited[i] == false){
               visited[i] = true;
                end(s, i, visited);
                answer++;
               
            }
        }
        return answer;
    }
    
    public static void end(String s, int start, boolean[] visited){
        int same=0;
        int diff = 0;
        char c = s.charAt(start);
        for(int i= start; i<s.length(); i++){
            
            if(diff == same && diff!= 0){
                break;
            }
            if(s.charAt(i) != c ) {
                diff++;
            }
            else{
                same++;
            }
            visited[i] = true;
            
        }
        return;
        
    }
}
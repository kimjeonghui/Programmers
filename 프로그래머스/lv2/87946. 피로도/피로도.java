import java.util.*;

class Solution {
    static int answer =0;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(0, k, dungeons, visited);
        return answer;
    }
    
    public void dfs(int depth, int k , int[][] dungeons ,boolean[] visited){
        for(int i=0; i<dungeons.length; i++){
            if(visited[i] || dungeons[i][0] > k){
                continue;
            }
            visited[i] = true;
            dfs(depth+1, k - dungeons[i][1], dungeons, visited);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}
import java.util.*;
class Solution {
    int answer = 99999;
    public int solution(int n, int[][] wires) {
        boolean[] visited = new boolean[n+1];
        int[][] matrix = new int[n+1][n+1];
        //초기화
        for(int i =0; i< wires.length; i++){
            matrix[wires[i][0]][wires[i][1]]= 1;
            matrix[wires[i][1]][wires[i][0]]= 1;
        }
        
        for(int i =0; i<wires.length; i++){
            matrix[wires[i][0]][wires[i][1]]= 0;
            matrix[wires[i][1]][wires[i][0]]= 0;
            
            bfs(matrix,  n);
                
            matrix[wires[i][0]][wires[i][1]]= 1;
            matrix[wires[i][1]][wires[i][0]]= 1;
        }
        
        return answer;
    }
    
    public void bfs(int[][] matrix, int n){
        boolean[] visited = new boolean[n+1];
        int cnt =0;
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<matrix.length; i++){
            
            if(!visited[i]){
                q.add(i);
            }
            
            while(!q.isEmpty()){
                int l = q.poll();
                cnt++;
                visited[l] = true;
                for(int j =1; j<matrix.length; j++){
                    if(!visited[j] && matrix[l][j]==1){
                        q.add(j);
                        
                    }
                }
               
            }
            answer = Math.min(Math.abs(n- cnt*2), answer);
            
        }
        
            
        
        
    }
}
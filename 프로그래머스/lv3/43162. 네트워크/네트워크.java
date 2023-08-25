import java.util.*;
class Solution {
    static int answer =0;
    
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[computers.length];
        Stack<Integer> stack = new Stack<Integer>();
        //dfs
       
        for(int i=0; i<computers.length;i++){
            if(visited[i] != true){
                stack.add(i); 
            dfs(stack,computers, visited);
             }
        }
           
        
        
        
            
        return answer;
    }
    
    public static void dfs( Stack<Integer> stack , int[][] computers, boolean[] visited){
        while(!stack.isEmpty()){
            int i =stack.pop();
            if(visited[i]!= true){
                
                visited[i] = true;
            for(int j=0; j< computers.length; j++){
                if(i != j && visited[j]!=true &&computers[i][j] == 1){
                    stack.push(j);
                }
            }
            
                
            }
            
        }
        answer++;
        
                }
            
        
    
    
}
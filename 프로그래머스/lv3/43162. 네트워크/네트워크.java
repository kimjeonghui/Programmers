// import java.util.*;
// class Solution {
//     static int answer =0;
    
//     public int solution(int n, int[][] computers) {
//         boolean[] visited = new boolean[computers.length];
//         Stack<Integer> stack = new Stack<Integer>();
//         //dfs
       
//         for(int i=0; i<computers.length;i++){
//             if(visited[i] != true){
//                 stack.add(i); 
//             dfs(stack,computers, visited);
//              }
//         }
           
        
        
        
            
//         return answer;
//     }
    
//     public static void dfs( Stack<Integer> stack , int[][] computers, boolean[] visited){
//         while(!stack.isEmpty()){
//             int i =stack.pop();
//             if(visited[i]!= true){
                
//                 visited[i] = true;
//             for(int j=0; j< computers.length; j++){
//                 if(i != j && visited[j]!=true &&computers[i][j] == 1){
//                     stack.push(j);
//                 }
//             }
            
                
//             }
            
//         }
//         answer++;
        
//                 }
            
        
    
    
// }

import java.util.*;
class Solution {
    static int [] parents;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int rows = computers.length;
        int cols = computers[0].length;
        parents = new int[n];

        // 자기자신을 부모로 초기화
        for (int i = 0; i < n; i++) parents[i] = i;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < cols; j++) {
                if (computers[i][j] > 0) {
                    if (getParents(j) != j) {
                        setParents(j, i);
                    }
                    else {
                        setParents(i, j);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (parents[i] == i) answer++;
        }
        return answer;
    }
    static void setParents(int parent, int child) {
        int p = getParents(parent);
        int c = getParents(child);
        parents[c] = p;
    }
    static int getParents(int child) {
        return parents[child] == child ? child : getParents(parents[child]);
    }
}
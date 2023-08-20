class Solution {
    static boolean[] visited;
  
    public int solution(int n, int[][] computers) {
        //dfs로 연결된지 확인 -> 스택
        //visited[]
        visited = new boolean[n];
        int cnt= 0;
        for(int i=0; i<n; i++){
            if(!visited[i]){
               dfs(i, computers);
            cnt++; 
            }
            
        }
   
        return cnt;
    }
    public static void dfs(int i, int[][] computers){
        visited[i] = true;
        for(int j =0; j<computers[i].length; j++){
            if( i != j &&visited[j] != true && computers[i][j] ==1 ){
                dfs(j,computers);
            }
        }
    }
}
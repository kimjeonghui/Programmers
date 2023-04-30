import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        
        Arrays.sort(costs, (o1 ,o2) -> {return o1[2] - o2[2];}
                   );
        
        for(int i=0; i<costs.length; i++){
            int from = costs[i][0];
            int to = costs[i][1];
            int cost = costs[i][2];
            
            if(find(from, parent) != find(to,parent)){
                union(from, to, parent);
                answer+= cost;
            }
        }
        return answer;
    }
    
    int find(int node, int[] parent){
        if(parent[node] == node)return node;
        return find(parent[node], parent);
    }
    
    void union(int node1, int node2, int[] parent){
        int parent1 = find(node1, parent);
        int parent2 = find(node2, parent);
        parent[parent1] = parent2;
    }
}
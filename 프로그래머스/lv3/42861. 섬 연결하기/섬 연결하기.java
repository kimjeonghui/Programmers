import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        int idx= 0;
        Arrays.sort(costs, new Comparator<int[]>() {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[2]-o2[2]; //오름차순 
    }
});
        for(int i =0; i<n; i++){
            parent[i] = i;
        }
        for(int i=0; i<costs.length; i++){
            int from = costs[i][0];
            int to = costs[i][1];
            int val = costs[i][2];
            if(idx == n-1) break;
            if(find(from,parent) != find(to, parent)){
                union(from, to, parent);
                answer+= val;
                idx++;
            }
            
        }
        return answer;
    }
    void union(int node1,int node2, int[] parent){
        int parent1 = find(node1, parent);
        int parent2 = find(node2, parent);
        parent[parent1] = parent2;
        
    }
    
    int find(int node, int[] parent){
        if(parent[node] == node)return node;
        return find(parent[node], parent);
        
    }

}
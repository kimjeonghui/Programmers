import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
     /*
        2차원배열로 연결 표시
        for문으로 wires 반복해서 첫번째부터 연결을 끊음
        answer = Math. min(answer, | 전체 노드의 수 - 연결이 끊길 때 노드의 수| )
        */
        int index = n;
        int[][] matrix = new int[index][index];

        //연결된 노드 표시
        for(int i=0; i<wires.length; i++){
            int a = wires[i][0]-1;
            int b = wires[i][1]-1;
            matrix[a][b] = 1;
            matrix[b][a] = 1;
        }

        int answer = Integer.MAX_VALUE;

        for(int i =0; i<wires.length; i++){
            int a = wires[i][0]-1;
            int b = wires[i][1]-1;
            matrix[a][b] = 0;
            matrix[b][a] = 0;

            boolean[] visited = new boolean[index];
            int nodeCount = 0;

            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            visited[0] = true;

            while(!stack.isEmpty()){
                int node = stack.pop();
                nodeCount++;

                for(int j=0; j<index; j++){
                    if(matrix[node][j] == 1 && !visited[j]){
                        stack.push(j);
                        visited[j] = true;
                    }
                }
            }

            matrix[a][b] = 1;
            matrix[b][a] = 1;

            answer = Math.min(answer, Math.abs(n - nodeCount * 2));
        }

        return answer;
    }
}
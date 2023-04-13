import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        boolean[] check = new boolean[routes.length];
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1])); 
        for(int i=0; i<routes.length; i++){
            if(check[i] == false){
                answer++;
                //int from = routes[i][0];
                int to = routes[i][1];
                for(int j=i+1; j<routes.length; j++){
                    int test_from = routes[j][0];
                    int test_to = routes[j][1];
                    if(to<= test_to && to>= test_from){
                        check[j] = true;
                    }
                }
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    static int cnt=0;
    
    public int solution(int[] numbers, int target) {
        dfs(0, numbers.length, numbers, 0, target);
        return cnt;
    }
    
    public static void dfs(int now, int depth, int[] numbers, int num, int target){
        if(now == depth){
            if(num == target) { 
                cnt++;
            }
            return;
        }
        
        dfs(now+1, depth, numbers, num + numbers[now], target);
        dfs(now+1, depth, numbers, num - numbers[now], target);
    }
}
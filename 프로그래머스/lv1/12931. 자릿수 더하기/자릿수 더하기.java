import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer= 0;
        int num = (int)(Math.log10(n)+1);
        //int cnt = n;
      
        for(int i = 0; i< num; i++){
            answer += (n % 10);
            n = n/10;
           // cnt = n/10;
        }
        
       
    
        return answer;
    }
}
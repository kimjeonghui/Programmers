import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while(pq.size() >= 2){
            if(pq.peek() < K){
            int i1 = pq.poll();
            int i2 = pq.poll();
            pq.add(i1+ i2*2);
            answer++; 
            }
            else break;
            
        }
        //모두 정렬되고 하나만 남은 경우
        if(pq.peek()>= K) return answer;
            
        return -1;
    }
}
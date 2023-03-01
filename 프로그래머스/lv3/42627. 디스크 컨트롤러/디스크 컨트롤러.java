import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        //소요시간
        int answer = 0;
        //끝나는 시간
        int end = 0;
        
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() { 
    @Override
    public int compare(int[] o1, int[] o2) {
        return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1]; 
    }
});
        PriorityQueue<int[]> readyQ =  new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        //Queue<int[]> playQ =  new LinkedList<>();
        for(int i=0; i<jobs.length; i++){
            q.add(jobs[i]);
        }
        int[] now = q.poll();
        answer+= now[1];
        end += (now[1] + now[0]);
        
        while(q.size() >0){
            if(readyQ.isEmpty()){
                
                if (q.peek()[0] > end && readyQ.isEmpty()){
                    now = q.poll();
                    answer+= now[1];
                    end = (now[1] + now[0]);
                    }
                while(q.peek()!= null ){
                    if(q.peek()[0] <= end){
                        readyQ.add(q.poll());
                    }
                    else break;
                }
                
            }
    
                while(!readyQ.isEmpty()){
                    
                    now = readyQ.poll();
                    //바로 실행되지 않는 경우
                    if(end < now[0]){
                        answer+= now[1];
                    }
                    else{
                        answer += (end - now[0] + now[1]);
                    }
                    end += now[1];
                    while(q.peek()!= null ){
                    if(q.peek()[0]<= end){
                        readyQ.add(q.poll());
                    }
                    else break;
                }
                
            }
            //실행된 동안 레디큐에 추가
        }
        
        
        
        return answer/jobs.length;
    }
}
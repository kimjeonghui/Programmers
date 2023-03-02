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

        for(int i=0; i<jobs.length; i++){
            q.add(jobs[i]);
        }

        int[] now = new int[2];
        while(q.size() >0){
            if(readyQ.isEmpty()){
                //마지막 작업시간보다 늦게 시작되는 경우
                if (q.peek()[0] > end ){
                    now = q.poll();
                    answer+= now[1];
                    end = (now[1] + now[0]);
                    }
                //마지막 작업 시간 전에 시작되는 경우
                while(q.peek()!= null ){
                    if(q.peek()[0] <= end){
                        readyQ.add(q.poll());
                    }
                    else break;
                }
                
            }
                //대기하고 있던 작업들 처리
                while(!readyQ.isEmpty()){
                    now = readyQ.poll();
                    answer += (end - now[0] + now[1]);
                    end += now[1];
                    //현 작업이 진행되고 있던 사이 대기하는 작업들 있나 확인
                    while(q.peek()!= null ){
                    if(q.peek()[0]<= end){
                        readyQ.add(q.poll());
                    }
                    else break;
                }  
            }
        }
        
        
        
        return answer/jobs.length;
    }
}
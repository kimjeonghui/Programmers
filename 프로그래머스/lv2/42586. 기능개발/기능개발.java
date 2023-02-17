import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
            Queue<Integer> list = new LinkedList<>();

            for(int i =0; i<progresses.length; i++){
                if((100-progresses[i])%speeds[i] != 0){
                    list.add((100-progresses[i])/speeds[i] +1);
                }
                else{
                    list.add((100-progresses[i])/speeds[i]);
                }

            }

            while(list.size()> 1){
                int i = list.poll();
                int num = 1;
                while(list.peek() != null){
                        if(i>= list.peek()) {
                            num++;
                            list.remove();
                        }
                        else break;
                }
                answer.add(num);
            }
            if(list.size() ==1 )answer.add(1);


            System.out.println(answer);
            return answer.stream().mapToInt(i -> i).toArray();
    }
   
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
       
       List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
       // 길이 수정 불가능  List list = Arrays.asList(arr);
        for(int i=0; i<query.length; i++){
            if((i+1) %2 == 0){//홀수 일 때
                list = list.subList(query[i], list.size());
                continue;
            } 
            else{
                list = list.subList(0, query[i]+1);
                continue;
            }
        }
         int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = (int)list.get(i);
        }
        return answer;
    }
}
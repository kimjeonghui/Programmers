import java.util.*;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;


class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        //List<Integer> peopleToList =Arrays.stream(people).boxed().toList();
        //List<Integer> peopleToList = Arrays.stream(people).boxed().collect(Collectors.toList());
        //String과 int형은 다름 String은 Arrays.asList로 가능하지만 int형은 Integer로 autoBoxing이 안되기
        //boxing을 해줘야 함
        //arr => ArrayList
        int light = 0;
        int heavy = people.length-1;
        while(light<heavy){
            if(people[light] + people[heavy]<= limit){
                answer++;
                light++;
                heavy--;
            }
            else{
                answer++;
                heavy--;
                //peopleToList.subList(0,peopleToList.size()-1);
            }
        }
        if(light == heavy) answer++;
        return answer;
    }
}
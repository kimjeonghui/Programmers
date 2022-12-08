import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //ArrayList<String> comple= new ArrayList<String>(Arrays.asList(completion));
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<participant.length; i++){
            if(!(participant[i].equals(completion[i]))){
                answer+= participant[i];
                break;
            }
        }
        return answer;
    }
}
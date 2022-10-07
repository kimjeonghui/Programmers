import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(String s) {
        String answer = "";
        //캐릭터형으로 변환 후 int로 변환, 내림차순 정렬, 다시 캐릭터 -> String
        Integer[] cToI = new Integer[s.length()];
    
        
        for(int i =0; i<s.length(); i++){
            cToI[i] = (int)s.charAt(i);
        }
        Arrays.sort(cToI,Comparator.reverseOrder()); 
        
        for(int i=0; i<cToI.length; i++){
            answer += (char)((int)cToI[i]);
        }
        return answer;
    }
}
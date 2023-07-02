import java.util.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int len=0;
        List<String> arr_s1 =new ArrayList<String>(Arrays.asList(s1));
         List<String> arr_s2 =new ArrayList<String>(Arrays.asList(s2));
        
        if(s1.length<=s2.length){
            len=s2.length;
            for(int i=0; i<len;i++){
                if(arr_s1.contains(arr_s2.get(i)))answer++;
             }
        }else{
            len = s1.length;
            for(int i=0; i<len;i++){
                if(arr_s2.contains(arr_s1.get(i)))answer++;
             }
        }
        
        
        return answer;
    }
}
import java.util.Arrays;
class Solution {
    public boolean solution(String s) {
        
        if(s.length() !=4 && s.length()!=6) return false;
        boolean answer = true;
        String[] array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        
        for(int i=0; i<s.length(); i++){
            String sToI = Character.toString(s.charAt(i));
            if(Arrays.asList(array).contains(sToI)){
             continue;   
            }
            else{
             answer = false;
             break;
            }
        }
        return answer;
    }
}
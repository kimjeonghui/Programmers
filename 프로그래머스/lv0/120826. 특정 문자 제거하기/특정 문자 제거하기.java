import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char letterToChar = letter.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(c != letterToChar) answer+= c;
        }
        return answer;
    }
}
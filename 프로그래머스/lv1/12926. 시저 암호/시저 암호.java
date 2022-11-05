class Solution {
    public String solution(String s, int n) {
        //소문자인 경우, 대문자인 경우
        String[] letters = s.split("");
        String answer = "";
        for(int i=0; i<letters.length; i++){
            if(letters[i].charAt(0) == ' ') {
                answer+= " ";
                continue;   
            }
            //대문자 경우
            if(letters[i].charAt(0) <= 'Z'&& letters[i].charAt(0) >= 'A'){
                n %=26;
                int j = (int)(letters[i].charAt(0) +n  -'A') %26;
                char c = (char)('A' + j);
                answer += String.valueOf(c);
            }
            else{
                n %=26;
                int j = (int)(letters[i].charAt(0) +n  -'a') %26;
                char c = (char)('a' + j);
                answer += String.valueOf(c);
            }
            
        }
        
        return answer;
    }
}
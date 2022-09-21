class Solution {
    public int solution(String s) {
        int answer = 0;
        String a = "";
        //기호가 붙은 경우    
            //양수인 경우
            //음수인 경우
        //기호가 안붙은 경우
        
        if(s.charAt(0) =='+'){
            a += s.substring( 1, s.length());
            answer = Integer.valueOf(a);
        }
        else if(s.charAt(0) == '-'){
            a += s.substring( 1, s.length());
            answer = -1 * Integer.valueOf(a);
        }
        
        return Integer.valueOf(s);
    }
}
class Solution {
    public String solution(String s) {
        String answer = s;
        
        if(s.length()%2==0){//짝수인 경우
            int index = (int)s.length()/2;
            answer = answer.substring(index-1,index+1);
        }
        else{
            int index = (int)s.length()/2;
            answer = answer.substring(index, index+1);
        }
        return answer;
    }
}
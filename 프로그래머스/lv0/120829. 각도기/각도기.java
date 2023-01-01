class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle<90 && 0<angle) answer=1;
        if(angle==90) answer=2;
        if(angle<180 && 90<angle) answer=3;
        if(angle==180) answer=4;
        return answer;
    }
}
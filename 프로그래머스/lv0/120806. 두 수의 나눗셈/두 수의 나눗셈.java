class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double a = (double)num1 /(double)num2;
        a *= 1000;
        
        answer = (int)a;
        return answer;
    }
}
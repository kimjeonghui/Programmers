class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n);
        if(num % 1 != 0){
            return -1;
        }
        answer = ((long)num +1)*((long)num +1);
   
        return answer;
    }
}
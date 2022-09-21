class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = 0;
        //x를 더한 숫자를 더하는 걸 n만큼 반복
        for(int i=0; i<n; i++){
            num += x;
            answer[i] = num;
        }
        return answer;
    }
}
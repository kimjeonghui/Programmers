class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = n;
        for(int i=0; i<String.valueOf(n).length(); i++){
            answer+= (mod %10);
            mod/= 10;
        }
        return answer;
    }
}
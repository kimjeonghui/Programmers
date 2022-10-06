class Solution {
    public String solution(int n) {
        String answer = "";
        String one ="수";
        String two ="박";
        for(int i =1; i<=n; i++){
            if(i%2 == 1) answer += one;
            else{
                answer += two;
            }
        }
        return answer;
    }
}
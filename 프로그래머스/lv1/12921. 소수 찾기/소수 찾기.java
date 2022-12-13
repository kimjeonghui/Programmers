class Solution {
    public int solution(int n) {
        int answer = 0;
        final int round = n;
        for(int i=2; i<=round; i++){
            if(isPrime(i)){
                answer++;
            }
            n--;
        }
        return answer;
    }
    
    public boolean isPrime(int i){
        if(i ==2) return true;
        for(int j=2; j<=Math.sqrt(i); j++){
            if(i%j ==0)return false;
        }
        return true;
    }
}
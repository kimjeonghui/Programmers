class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max=0;
        int min =0;
        if(a>b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }
        
        for(int i=0; i<max-min+1; i++){
            answer += min+i;
        }
        
        return answer;
    }
}
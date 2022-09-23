class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num; //오버플로우 
        
        if( num ==1) return 0;
        for(int i=0; i<500; i++){
            if(n != 1){ //n이 1이 아닌 경우
                if(n %2 == 0){//짝수인 경우
                    n /= 2;
                }
                else{//홀수인 경우
                    n = n*3 +1;
                }
            }
            else{//n이 1인 경우
                return i;
            }
            
        }
        answer = -1;
        return answer;
    }
}

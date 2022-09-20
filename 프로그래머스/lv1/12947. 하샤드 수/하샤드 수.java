class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum =0;
        int num =x;
        for(int i=0; i<(int)(Math.log10(x)+1); i++){ // 두자리 수인 경우 
            sum += num% 10;
            num /= 10;
        }
        answer = (x%sum == 0)?true:false;
        return answer;
    }
}
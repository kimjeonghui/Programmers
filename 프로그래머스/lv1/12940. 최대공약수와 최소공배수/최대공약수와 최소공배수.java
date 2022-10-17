class Solution {
    public int[] solution(int n, int m) {
        int[] answer;
        int max=0;
        int min = 0;
        if(n> m){
            max = n;
            min= m;
            }
        else{
            max = m;
            min = n;
        }
        //최대공약수
        while(min!=0){
            int r = max %min;
            max = min;
            min= r;
        }
        //최대공약수
        int gdb = m*n / max;
        answer = new int[]{max, gdb};
        return answer;
    }
}
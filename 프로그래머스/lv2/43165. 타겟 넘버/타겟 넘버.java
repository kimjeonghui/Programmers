class Solution {
    static int t;
    static int cnt=0;
    public int solution(int[] numbers, int target) {
       //재귀 -> dfs 인가?
        //for(numbers.length)
        // + numbers[i] 경우
        // - numbers[i] 경우
        //i가 마지막인 경우 && 합이 타겟인 경우 cnt++;
        t = target;
        dfs(numbers, 0, 0);
        
     
        
        return cnt;
    }
    
    static public void dfs(int[] numbers, int depth, int sum){
        if(depth==numbers.length){
            if(sum == t) cnt++;
        } 
        else{
            dfs(numbers, depth+1, sum+ numbers[depth]);
            dfs(numbers, depth+1, sum- numbers[depth]);
        }
    }
    
}
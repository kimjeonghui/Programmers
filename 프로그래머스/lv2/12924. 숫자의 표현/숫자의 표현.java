class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += dfs(i, n, 0);
        }
        return answer;
    }

    int dfs(int now, int n, int sum) {
        sum += now;
        if (sum == n) {
            return 1;
        }
        if (sum > n) {
            return 0;
        }
        return dfs(now + 1, n, sum);
    }
}

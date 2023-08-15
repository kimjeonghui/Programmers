import java.util.*;

public class Main {
    static int n;
    static int[] nums;
    static int[] operators;
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        nums = new int[n];
        operators = new int[4];  // 0: +, 1: -, 2: *, 3: /
        
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 4; i++) {
            operators[i] = scanner.nextInt();
        }

        dfs(1, nums[0]);
        System.out.println(maxResult);
        System.out.println(minResult);
    }

    public static void dfs(int idx, int result) {
        if (idx == n) {
            maxResult = Math.max(maxResult, result);
            minResult = Math.min(minResult, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operators[i] > 0) {
                operators[i]--;
                int newResult = calculate(result, nums[idx], i);
                dfs(idx + 1, newResult);
                operators[i]++;
            }
        }
    }

    public static int calculate(int a, int b, int operator) {
        switch (operator) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
            default:
                return 0; // Should not happen
        }
    }
}

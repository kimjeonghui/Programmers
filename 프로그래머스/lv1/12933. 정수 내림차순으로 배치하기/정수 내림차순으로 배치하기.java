import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        char[] chararr = s.toCharArray();
        Arrays.sort(chararr);
        StringBuilder sb = new StringBuilder(new String(chararr));
        s = sb.reverse().toString();
        answer = Long.parseLong(s);
        return answer;
    }
}
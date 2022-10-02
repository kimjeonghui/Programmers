import java.util.Arrays;
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1) {
            answer = new int[]{-1};
        }
        else{
            int min = Arrays.stream(arr).min().getAsInt();
            answer = new int[arr.length -1];
            int cnt =0;
            for(int i =0; i<arr.length; i++){
                if( arr[i] == min){
                    continue;
                }
                else{
                    answer[cnt] = arr[i];
                    cnt++;
                }
            }
        }
        return answer;
    }
}
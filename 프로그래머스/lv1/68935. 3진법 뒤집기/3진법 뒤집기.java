import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

class Solution {
    public int solution(int n) {
        int answer = 0;
        //3진법으로 반환하기 위한 스택
       // Stack<Integer> stack = new Stack<>(); 메모리 사용 한도 초과
        
        //3진법 숫자를 넣은 공간, 거꾸로 정렬해야 함
        ArrayList<Integer> list = new ArrayList<>();
        
    
        while(n>=3){
            int i = n % 3;
            list.add(i);
            n = n/3;
        }
        if(n!=0)list.add(n);
        
    
        //반전해주기
        Collections.reverse(list);
        
        //10진수로 변환
        for(int i =0; i<list.size(); i++){
            answer += (list.get(i) * Math.pow(3, i));
        }
        return answer;
    }
}
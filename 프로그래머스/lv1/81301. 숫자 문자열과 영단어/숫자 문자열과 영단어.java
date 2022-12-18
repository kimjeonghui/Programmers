import java.util.*;

class Solution {
    public int solution(String s) {
        //해시맵 
        //스트링으로 한글자씩 저장, 숫자가 나오면 그대로 스트링에 더하기, 
        //영어로 나오면 해당 키를 찾아서 값을 스트링에 더하기
        //스트링을 숫자로 변환
        
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        String a = "";
        String convert = "";
        for(int i=0; i<s.length(); i++){
        
            //글자인 경우
            if(s.charAt(i)>'9' ){
                a+= String.valueOf(s.charAt(i));
                if(map.get(a)!= null){
                    convert+= map.get(a);
                    a = "";
                }
            }
            //숫자인 경우
            else {
                convert+= String.valueOf((s.charAt(i)));
            }
        }
       
        int answer = 0;
        
        answer = Integer.valueOf(convert);
        return answer;
    }
}
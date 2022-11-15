import java.util.*;
class Solution {
     public int solution(int n) {
        int answer = 0;
        
        int curOne = toBinary(n);
		
		while(true) {
			int nextOne = toBinary(++n);
			if(curOne == nextOne) break;
		}
		answer = n;
        
        return answer;
    }
    
    //2진수로 변환했을 때 1의 개수
	private static int toBinary(int n) {
		int one = 1;
		
		while(n > 1) {
			if(n % 2 == 1) {
				one++;
			}
			n /= 2;
		}
		
		return one;
	}
   /* public int solution(int n) {
        int answer = 0;
        // '01이 있는 지 확인'
        //
        //스트링 자르고 붙이는 함수로  앞에 붙여주고
        //01을 10으로 체인지
        //뒤에는 남은 자릿수만큼 0과 1로 채워주기 
            //1의 개수도 알아야 함
        String result = "";
        String a= Integer.toBinaryString(n);
        int idx = a.indexOf("01");
        if(idx != -1){
            int cnt =0;
            for(int i =0; i<a.length(); i++){
                if(a.charAt(i) =='0') cnt++;
            }
            
          result = a.substring(0, idx) + "10";
            int j =  a.length() -result.length();
            
        for(int i =0; i<j; i++){
            if(i >= cnt-2) result+= "1";
            else result += "0";
        }
        }
        else{ // 모두 1
            result = "10" + a.substring(1, a.length());
        }
        
        return Integer.parseInt(result, 2);
    }
    
    */
}
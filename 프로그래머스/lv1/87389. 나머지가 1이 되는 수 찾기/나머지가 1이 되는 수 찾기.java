class Solution {
    public int solution(int n) {
        int answer = 0;
        do{
            answer++;
        }while((n % answer) != 1);
        
        return answer;
        
        
         /*int cnt=0; //배열의 인덱스를 위한 변수
        int[] answer = {};
        //스트링으로 변환
        //더블에서 스트링으로 바로 변환이 안되니 인트로 변환 먼저
        // 더블에서 인트형은 다운캐스팅이니 형변환자를 써야 함
        long i = (int)n;
        String s = Integer.toString((int)i);
        //int i = (int)n;
       // String s = Integer.toString(i);
        //스트링 순서 뒤집기
        StringBuffer sb = new StringBuffer(s);
        String s_rv = sb.reverse().toString();
        //인트로 변환하면서 배열에 넣기
        //배열 메모리 크기 
        answer = new int[s_rv.length()]; 
        for(double j = 0; j<s_rv.length(); j++){
         
            //char로 저장된 숫자를 int로 변환 해줄 때 -'0'
            answer[(int)j] =(s_rv.charAt((int)j)-'0');
          
        } //배열은 add가 아니라 인덱스로 값 할당
        */
    }
}

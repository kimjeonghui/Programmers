class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCnt =0;
        int cnt =0;
        String convert = s;
        while(!convert.equals("1")){
            int next =0;
            for(int i =0; i<convert.length(); i++){
                char c = convert.charAt(i);
                if(c =='0') zeroCnt++;
                else next++;
            }
            //이진수로 변환하고 convert에 저장
            convert = Integer.toBinaryString(next);
            cnt++;
        }
        answer[0]= cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}
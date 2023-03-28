import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int move = name.length() -1; //좌우 조작 횟수
        int index = 0;
        int numA;
        for(int i =0; i< name.length(); i++){
            answer += count(String.valueOf(name.charAt(i)));
            //ddaaa
            index = i+1; 
            numA =0 ;
            while(index< name.length() && name.charAt(index) == 'A'){
                
                index++;
                numA++;
            }
            //move = Math.min(move, (i+1)*2 +name.length() -(index + 1) );
            move = Math.min(move, i * 2 + name.length() - index);
            move = Math.min(move, (name.length() - index) * 2 + i);
        }
        return answer+ move;
    }
    
    //위아래 조작 횟수 세기
    private int count(String s){
        String BM = "BCDEFGHIJKLMN"; //indexOf()+1
        String ZN = "ZYXWVUTSRQPO"; //indexOf()+1
        
        int answer = 0;
            if(BM.indexOf(s) >= 0){
                answer = BM.indexOf(s) +1;
            }else if(ZN.indexOf(s) >= 0){
                answer = (ZN.indexOf(s) +1 );
            }
        
         return answer;
}
}
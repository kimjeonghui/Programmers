class Solution {
    public String solution(String number, int k) {
        //String answer = "";
        int index = 0;
        int range =0;
        
        //StringBuilder사용 안할 시 시간 초과
        StringBuilder sb = new StringBuilder();
        
        
        for(int m=0; m<number.length()-k; m++){
             int max =0;
           
                // i<k+m :테스트 통과 못함
            // max = Integer.parseInt(String.valueOf(number.charAt(i)) : 시간초과
                for(int i =index; i<=k+m; i++){
              
                if( max < number.charAt(i) -'0'){
                   max = number.charAt(i) -'0'; 
                    index = i+1;
                    if(max ==9 )break;
                    }  
                }
                sb.append( String.valueOf(max));
        
        }
           

        
        return sb.toString();
    }
}
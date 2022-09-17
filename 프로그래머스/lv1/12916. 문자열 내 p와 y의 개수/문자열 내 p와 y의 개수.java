class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String c = s.toUpperCase();
        int p = 0;
        int y = 0;
        
        /*for(char x : c){  향상된 반복문은 반복할 수 있는 배열만 가능
           if(x == 'P'){
               p++;
               continue;
           }
            if(x == 'Y'){
                y++;
            } 
        }*/
        
        for(int i =0; i< c.length(); i++){
            if(c.charAt(i) == 'P'){
               p++;
               continue;
           }
            if(c.charAt(i)  == 'Y'){
                y++;
            } 
        }
        if(p != y) answer = false;
      
        return answer;
    }
}

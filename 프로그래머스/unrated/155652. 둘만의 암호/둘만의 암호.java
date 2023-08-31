class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
       // String[] skips = skip.split("");
        for(int i=0; i< s.length(); i++){
            char ch = s.charAt(i) ;
            int cnt = 0;
            while(cnt<index){
                
                ch++;
                if(ch> 'z') {
                ch-= 26;
               // ch += 'a';
            }
                if(skip.indexOf(ch) == -1){
                    cnt++;
                }
                
                
            }
            
            answer+= ch;
            
            
          
        }
        return answer;
    }
}
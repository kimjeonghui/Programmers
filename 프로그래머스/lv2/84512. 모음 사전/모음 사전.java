class Solution {
  static int one = 781;
        static int two = 156;
        static int three = 31;
        static int four = 6;
        static int five = 1;
        
    public int solution(String word) {
        int answer = 0;
        String arr= "AEIOU";
        int num = word.length();
        
        switch(num){
            case 1:
                answer = 1+ one * arr.indexOf(word);
                break;
            case 2:
                answer = 2+ one * arr.indexOf(word.charAt(0)) +  two * arr.indexOf(word.charAt(1));
                break;
            case 3:
                answer = 3+ one * arr.indexOf(word.charAt(0)) +  two * arr.indexOf(word.charAt(1)) + three * arr.indexOf(word.charAt(2));
                break;
            case 4:
                answer = 4+ one * arr.indexOf(word.charAt(0)) + two * arr.indexOf(word.charAt(1)) + three * arr.indexOf(word.charAt(2)) + four * arr.indexOf(word.charAt(3));
                break;
            case 5:
                answer = 5+ one * arr.indexOf(word.charAt(0)) + two * arr.indexOf(word.charAt(1)) + three * arr.indexOf(word.charAt(2)) + four * arr.indexOf(word.charAt(3)) +five * arr.indexOf(word.charAt(4));
                
        }
        // if(num >=1){
        //     answer = 1+ one * arr.indexOf(word);
        // }else if(num >=2){
        //     answer += 1+ two * arr.indexOf(String.valueOf(word.charAt(1)));
        // }else if(num >=3){
        //     answer += 1+ three * arr.indexOf(String.valueOf(word.charAt(2)));
        // }else if(num >=4){
        //     answer += 1+ four * arr.indexOf(String.valueOf(word.charAt(3)));
        // }else{
        //     answer += 1+ five * arr.indexOf(String.valueOf(word.charAt(4)));
        // }
        
        return answer;
    }
}
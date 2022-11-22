import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt =0;
        ArrayList<String> list = new ArrayList<>();

        //indexOf(단어)
        //인덱스 몫, 나머지로 몇 번째 턴, 몇 번 사람인지 구하기
        for(int i=0; i<words.length -1; i++){
            cnt++;
            if(list.contains(words[i+1])) break;
            list.add(words[i]);
            char c1 = words[i].charAt(words[i].length()-1);
            char c2 = words[i+1].charAt(0);
            if(c1 != c2){
                answer[0] = i%n +1;
                answer[1] = i/n +1 ;
                break;
            }
            else{
                if(i == words.length-2 && !list.contains(words[i+1])) {
                    return new int[]{0, 0};
                }
                else if(i == words.length-2 && list.contains(words[i+1])){
                    answer[0] = i%n +1;
                    answer[1] = i/n +1 ;
                    break;
                }
                
                else continue;
        
            }
        }
        answer[0] = cnt%n +1;
        answer[1] = cnt/n +1 ;

        return answer;
    }
}
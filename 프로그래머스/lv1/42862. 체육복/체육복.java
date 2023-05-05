import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] people = new int[n];
        int answer = n;

        for (int l : lost) 
            people[l-1]--;
        for (int r : reserve) 
            people[r-1]++;

        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else 
                    answer--;
            }
        }
        return answer;
    }
}


// class Solution {
//     public int solution(int n, int[] lost, int[] reserve) {
//         int answer = n - lost.length;
//         // 빌려줄수 있는 학생의 번호
//         ArrayList<Integer> reservelist = new ArrayList<>();
//         ArrayList<Integer> lostlist = new ArrayList<>();

//         int i = 0;
//         while(reserve.length > i) {
//             reservelist.add(reserve[i]);
//             i++;
//         }

//         i = 0;
//         while(lost.length > i) {
//             lostlist.add(lost[i]);
//             i++;
//         }
       
//   		// 1차 실행 실패 테스트 케이스 12, 13, 18오류 해결 코드
//         Collections.sort(lostlist);
//         Collections.sort(reservelist);
       
//          //2차 실행 실패 테스트 케이스 5, 12번 해결코드
//          for(i = 0; i<reservelist.size(); i++) {
//             loop: for(int j=0; j<lostlist.size(); j++) {
//                 if(reservelist.get(i) == lostlist.get(j)) {
//                     lostlist.remove(j);
//                     reservelist.remove(i);
//                     i = -1;
//                     answer ++;
//                     break loop;
//                 }
//             }
//         }
       
//         for(i=0; i<lostlist.size(); i++) {

//             loop: for(int j=0; j<reservelist.size(); j++) {

//                 int k = -1;
//                 while(k<=1) {
//                     if(lostlist.get(i) == reservelist.get(j) + k) {
//                         reservelist.remove(j);
//                         lostlist.remove(i);
//                         i = -1;
//                         answer ++;

//                         if(reservelist.size() == 0 || lostlist.size() == 0) {
//                             return answer;
//                         }
//                         break loop;
//                     }

//                     k++;
//                 }
//             }
//         }

//         // 전체 학생수 n - 체육복을 빌리지 못한 학생수
//         return answer;
//     }
// }


        /*for(int i=0; i<lost2.length; i++){
            for(int j=0; j<reserve2.length; j++){
                if(lost2[i] == reserve2[j]){
                    reserve2[j]=100;
                         break;
                }
                     if(lost2[i]+1 == reserve2[j]){
                    reserve2[j]=100;
                         break;
                }
                if(lost2[i]-1 == reserve2[j]){
                    reserve2[j]= 100;
                    break;
                }  
                if(j==reserve2.length-1) answer2--;
            }
            
        }*/
        //if(answer<answer2) answer= answer2;
        
  

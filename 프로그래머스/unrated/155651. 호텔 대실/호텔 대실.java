import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        
        //Arrays.sort(book_time, Comparator.comparing(this::convertToMinutes));
    // for (String[] row : book_time) {
    //     Arrays.sort(row, Comparator.comparing(this::convertToMinutes));
    // }
        
         Arrays.sort(book_time, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int s1_start =convertToMinutes(o1[0]);
                int s1_end =convertToMinutes(o1[1]);
                int s2_start =convertToMinutes(o2[0]);
                int s2_end =convertToMinutes(o2[1]);
                if(s1_start == s2_start) return s1_end - s2_end;
                return s1_start - s2_start;
			}
		});
        PriorityQueue<Integer> endTimes = new PriorityQueue<>();
        int currentIndex = 0;

        for (String[] time : book_time) {
            int start = convertToMinutes(time[0]);
            int end = convertToMinutes(time[1]);
            
            endTimes.offer(end);
            // 현재 예약 시작 시간보다 빨리 끝나는 예약 제거
            while (!endTimes.isEmpty() && endTimes.peek()+10<= start) {
                endTimes.poll();
            }

            

            answer = Math.max(answer, endTimes.size());

            currentIndex++;
        }

        return answer;
    }

    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}


// import java.util.*;
// class Solution {
//     public int solution(String[][] book_time) {
//         int answer = 0;
//         Arrays.sort(book_time, (o1, o2) -> Integer.parseInt(o1[0].split(":")[0])*60+Integer.parseInt(o1[0].split(":")[1]) - Integer.parseInt(o2[0].split(":")[0])*60+Integer.parseInt(o2[0].split(":")[1]) );
//         /*
//         일분씩 증가시키면서 동시에 사용중인 방의 개수
//         Math.max() 로 구하기
//         */
//         String[] s1 = book_time[0][0].split(":");
//         String[] end = book_time[book_time.length -1][1].split(":");
//         int time = Integer.parseInt(s1[0])*60 + Integer.parseInt(s1[1]) ;//0~ 23*60 +50 1430 
        
//         for(int i= time; i<=Integer.parseInt(end[0])*60 + Integer.parseInt(end[1]); i++){       
//             Queue<Integer> q = new LinkedList<>();
//             for(String[] s : book_time){
//                 String[] start = s[0].split(":");
//                 String[] end2 = s[1].split(":");
//                 if(Integer.parseInt(start[0])*60 + Integer.parseInt(start[1]) == i)q.add(Integer.parseInt(end2[0])*60 + Integer.parseInt(end2[1]) );
                
//                 while(q.size()>0){
//                     if(q.peek() +10== i) q.poll();
//                     if(q.isEmpty()) break;
//                 }
                
//                 answer = Math.max(answer, q.size());
                
               
//             }    
//         }
        
//         return answer;
//     }
    
// }
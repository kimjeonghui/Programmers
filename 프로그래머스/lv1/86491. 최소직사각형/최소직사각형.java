import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        //두개의 값을 비교해서 정렬하기 
        //bigger little 중에 제일 큰 값을 곱해서 리턴
        List<Integer> bigger = new ArrayList<>();
        List<Integer> little = new ArrayList<>();
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i=0; i<sizes.length; i++){
            bigger.add(sizes[i][0]);
            little.add(sizes[i][1]);
        }
        
        int m1 = Collections.max(bigger);
        int m2 = Collections.max(little);

        
        /*Integer m2 =  little.stream()
            .mapToInt(x -> x)
                .max();
          */      
                
        return m1 * m2;
    }
}
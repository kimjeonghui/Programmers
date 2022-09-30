import java.util.*;
import java.util.Arrays;  
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0 ){
                list.add(arr[i]);
            }
        }
         if(list.size() == 0){
            int[] answer = {-1};
            return answer;
        }
        Collections.sort(list);
       
        
        int []answer =  list.stream()
                .mapToInt(i -> i)
                .toArray();
        
         
        
        
        //answer.sort()
        
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hash= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.replace(nums[i], hash.get(nums[i])+1);
            }else{
                hash.put(nums[i], 1);
            }
              
        }
        
    if(hash.size()< nums.length/2){
        answer = hash.size();
    }else{
        answer = nums.length/2;
    }
        
        return answer;
    }
}
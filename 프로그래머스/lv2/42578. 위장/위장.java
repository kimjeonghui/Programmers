import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
       //  int answer = 1;
       //  HashMap<String, Integer> hm = new HashMap<String, Integer>();
       // // for(int i=0; i<clothes.length; i++){
       //      //java.lang.NullPointerException
       //      //hm.put(clothes[i][1], (hm.getOrDefault(clothes[i][1], 0)+1));
       //  //}
       //  for(String[] cloth: clothes){
       //      String c = cloth[1];
       //      hm.put(c, hm.getOrDefault(c,0)+1);
       //  }
       //  for(int i =0; i< hm.keySet().size(); i++){
       //      answer*= (hm.get(clothes[i][1]).intValue()+1);
       //  }
          HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext())
            answer *= it.next().intValue() + 1;

        // 3. 아무종류의 옷도 입지 않는 경우 제외하기
        return answer - 1;

      
    }
}
import java.util.*;
class Solution {
    public int solution(String numbers) {
        //넘버스로 만들 수 있는 모든 경우의 수 구하기 
        //순열 만들어서 소수인지 확인하고 해시맵에 없으면 저장
        // 단 앞이 0인 경우는 미포함
        //해시의 사이즈 구하기
        
        Set<Integer> set =new HashSet<>();
        
        //1. numbers를 잘라서 리스트에 넣기
        ArrayList<Integer> nums = new ArrayList<>();
        String[] s = numbers.split("");
        for(int i=0; i<s.length; i++){
            nums.add(Integer.parseInt(s[i]));
        }
        
        //2. 순열 만들기 
        for(int i=1; i<=numbers.length(); i++){
            permutation(nums, new String(), new boolean[numbers.length()], 0, i,set);
        }
        
        //소수인지 확인하기 
        int answer = prime(set);
        return answer;
    }
    public void permutation(ArrayList<Integer> arr, String output, boolean[] visited, int depth, int r, Set<Integer> set){
          if (depth == r) {
        if (output.charAt(0) == '0' && output.length()>1) {
            set.add(Integer.parseInt(output.substring(1,output.length())));
        }
        else{
             set.add(Integer.parseInt(output));
        }
        return;
    }
        
        for(int i=0; i<arr.size(); i++){
            if(!visited[i]){
                visited[i] =true;
                output += String.valueOf(arr.get(i));
                permutation(arr, output, visited, depth+1, r, set);
                output = output.substring(0, output.length()-1);
                visited[i]= false;
            }
        }
    }
    
    int prime(Set<Integer> set) {
    int ans = 0;
    for (Integer i : set) {
        if (i < 2) continue; // 0과 1은 소수가 아니므로 건너뜁니다.
        boolean isPrime = true;
        int sqrt = (int) Math.sqrt(i);
        for (int j = 2; j <= sqrt; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            ans++;
        }
    }
    return ans;
}








}
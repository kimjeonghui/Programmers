class Solution {
    public String solution(String s) {
        String answer = "";
        String[] s1 = s.split(" ");
        //int[] i = new int[s.length];
        int max = Integer.parseInt(s1[0]);
        int min =  Integer.parseInt(s1[0]);
        for(int j =1; j<s1.length; j++){
           max = (max<Integer.parseInt(s1[j]))?Integer.parseInt(s1[j]):max;
           min= (min>Integer.parseInt(s1[j]))?Integer.parseInt(s1[j]):min;
        }
        answer = min+ " " + max;
        
        return answer;
    }
}
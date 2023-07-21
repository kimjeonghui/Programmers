class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length> arr2.length) answer = 1;
        else if(arr1.length< arr2.length) answer = -1;
        else{
            int i1=0;
            int i2=0;
            for(int i=0; i<arr1.length;i++){
                i1 += arr1[i];
                i2 += arr2[i];
            }
            if(i1>i2) answer=1;
            else if(i1<i2) answer =-1;

        } 
        return answer;
    }
}
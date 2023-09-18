import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int sum= 0;
        //초기화
        for(int i=1; i<triangle.length; i++){
            triangle[i][0] += triangle[i-1][0];
            triangle[i][triangle[i].length-1]+=triangle[i-1][triangle[i-1].length-1];
        }
        
        for(int i=2; i< triangle.length; i++){
            for(int j=1; j<triangle[i].length-1; j++){
                if(triangle[i-1][j-1]> triangle[i-1][j])triangle[i][j] = triangle[i][j] + triangle[i-1][j-1];
                else triangle[i][j] = triangle[i][j] + triangle[i-1][j];
                // triangle[i-1][j-1]> triangle[i-1][j]? triangle[i][j] = triangle[i][j] + triangle[i-1][j-1] : triangle[i][j] = triangle[i][j] + triangle[i-1][j];
            }
        }
        
        Arrays.sort(triangle[triangle.length-1]);
        int row =  triangle[triangle.length-1].length;
        answer = triangle[triangle.length-1][row-1];
        return answer;
    }
}
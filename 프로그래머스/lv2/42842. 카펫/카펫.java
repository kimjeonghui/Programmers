import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //x 가로, y 세로
        //x * y = brown + yellow
        //(x-2)(y-2) =xy -2x -2y+4 =  yellow
        //(x+y)**2 = x**2 + y**2 + 2xy = (브라운+옐로우)**2
        //2(x +y) -4 = 브라운
        int sum =brown + yellow;
        int XPlusY = (brown+4)/2;
        int XMulY = brown + yellow;
        
        int x =1;
        boolean check =true;
        //int y =1;
        //가로는 세로와 같거나 더 큼
       while(check){
           
           for(int i=1; i<=x; i++){
               //if(sum % i ==0){
                if(x+ i == XPlusY && x*i == XMulY)  {
                    answer[0] = x;
                    answer[1] = i;
                    check = false;
                    break;
                }
               //}
               //x++;
           }
           x++;
       }
        return answer;
    }
}
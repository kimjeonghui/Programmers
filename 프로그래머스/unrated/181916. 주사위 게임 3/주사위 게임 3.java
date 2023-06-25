import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //모두 같은 경우
        if(a == b && a == c && a == d){ 
            return a *1111;
        }
        //세개가 같은 경우
        if(a == b && a ==c && a!=d){
            return (10*a +d) *(10*a +d);
        }
        if(a==c&& a==d && a!=b){
             return (10*a +b) *(10*a +b);
        }
        if(b==c&& b==d&& a!=b){
             return (10*b +a) *(10*b +a);
        }
         if(a == b && a ==d && a!=c){
            return (10*a +c) *(10*a +c);
        }
        //두개씩 같은 경우
        if(a==b&& c ==d){
            return (a+c)* Math.abs(a-c);
        }
        if(a==c&& b==d){
            return (a+b)* Math.abs(a-b);
        }
        if(b==c &&a==d){
            return (a+b)* Math.abs(a-b);
        }
         
        //두개만 같은 경우
        if(a==b){
            return c*d;
        }
        if(a==c){
            return b*d;
        }
        if(a==d){
            return b*c;
        }
        if(b==c){
            return a*d;
        }
         if(b==d){
            return a*c;
        }
        if(c==d){
            return a*b;
        }
        
        int[] list = new int[]{a, b,c,d};
        Arrays.sort(list);
        return list[0];
    }
}
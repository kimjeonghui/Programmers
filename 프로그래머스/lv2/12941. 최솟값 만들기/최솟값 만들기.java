import java.util.stream.IntStream; 
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        IntStream stream = IntStream.of(A);
       A =  stream.sorted().toArray();
        IntStream stream2 = IntStream.of(B);
        B = stream2.sorted().toArray();
        
        for(int i=0; i<A.length; i++){
            answer += A[i]* B[B.length-i-1];
        }

        return answer;
    }
}
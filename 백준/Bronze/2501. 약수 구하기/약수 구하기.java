import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] q = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        int N =Integer.parseInt(q[0]);
        int M = Integer.parseInt(q[1]);
        for(int i=1; i<=N; i++){
            if(N% i ==0)list.add(i);
         }
       
        if(list.size() < M){
            System.out.println("0");
   
        }
        else{
             int answer = (int)list.get(M-1);
             System.out.println(answer);
        }
       
    }
}
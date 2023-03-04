import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String answer ="";
        for(int j=0; j<i/4; j++){
            answer+= "long ";
        }
        answer+= "int";
        System.out.println(answer);
//        Kgh k = new Kgh();
//        int a;
//        a = k.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }

    }
}
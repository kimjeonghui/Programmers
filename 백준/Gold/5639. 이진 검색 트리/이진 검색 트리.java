

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node node = new Node(sc.nextInt());
        while(sc.hasNext()){
            node.insert(sc.nextInt());
        }
        postOrder(node);
        
    }
    static void  postOrder(Node node){
        if(node == null ) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.num);
    }
    static class Node{
        int num;
        Node left, right;

        Node(int num){
            this.num = num;
        }
        Node(int num, Node left, Node right){
            this.num = num;
            this.left = left;
            this.right = right;
        }

        void insert(int n){
            if(n<this.num){
                if(this.left == null) this.left = new Node(n);
                else this.left.insert(n);
            }
            else{
                if(this.right == null) this.right = new Node(n);
                else this.right.insert(n);
            }
        }

       

    }
}

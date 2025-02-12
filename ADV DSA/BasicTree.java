import java.util.*;
class Node{
    int val;
    Node left;
    Node right;
}
public class BasicTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node root = create();
        print(root);
    }
    public static void print(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
    public static Node create(){
        Node n = new Node();
        n.val = sc.nextInt();
        boolean l = sc.nextBoolean();
        boolean r = sc.nextBoolean();

        if(l==true){
            n.left = create();
        }
        if(r==true){
            n.right = create();
        }
        return n;
    }
}
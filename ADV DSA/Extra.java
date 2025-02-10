public class Extra {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.println("Hello " + name);
        Toss1(2, "");
    }
    public static void Toss1(int n,String ans) {
        if(n==0) {
            System.out.println(ans);
            return;
        }
        Toss1(n-1,ans+"H");
        Toss1(n-1,ans+"T");
    }
}

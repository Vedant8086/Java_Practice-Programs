public class Recursion {
    public static int facts(int n) {
        if(n == 1) {
            return 1;
        }
        return n * facts(n-1);
    }
    public static int fibo(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int prev = fibo(n-1);
        int prevkprev = fibo(n-2);
        return prev + prevkprev;

    }
    public static int new_fibo(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return new_fibo(n-1) + new_fibo(n-2);
    }
    static int iteration = 0;
    public static void Toss(int n,String ans,int r,int b) {
        if(n==0) {
            System.out.println(ans+ " "+ r + " " + b);
            iteration += 1;
            return;
        }
        Toss(n-1,ans+"B",r,b+1);//red call
        Toss(n-1,ans+"R",r+1,b);//black call
    }
    public static void Toss1(int n,String ans) {
        if(n==0) {
            System.out.println(ans);
            return;
        }
        Toss1(n-1,ans+"H");//red call
        Toss1(n-1,ans+"T");//black call
    }
    public static void New_Call(String que,String ans,int i) {
        if(i ==que.length()) {
            System.out.println(ans);
            return;
        }
        New_Call(que,ans+que.charAt(i),i+1);
        New_Call(que,ans,i+1);
    }
    public static void Generate(int n,String ans,int o,int c) {
        if(o == n || c == n) {
            System.out.println(ans);
            return;
        }
        if(o < n) {
            Generate(n,ans+"(",o+1,c);
        }
        if(c < o) {
            Generate(n,ans+")",o,c+1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Lecture 5 : Recursion !!!");
        System.out.println(facts(6));
        System.out.println(fibo(3));
        System.out.println(new_fibo(10));
        String new_string = "";
        Toss(4,new_string,0,0);
        System.out.println("Total Number of Iteration : "+iteration);
        System.out.println(new_string);
        New_Call("abc","",0);
        System.out.println("Program Ended !!!");
        int o = 0,c = 0;
        String new_string_x = "";
        Generate(3, new_string_x,o,c);
    }    
}

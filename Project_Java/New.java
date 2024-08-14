import java.lang.*;

    class X extends Thread {
        public void run() {
            int i;
            for(i=0;i<5;i++) {
                System.out.println("From thread X: I = "+i);
            }
        }
    }
    class Y extends Thread {
        public void run() {
            int i;
            for(i=0;i<5;i++) {
                System.out.println("From thread Y: I = "+i);
            }
        }
    }
class New { 
    public static void main(String[] args)  {
        new X().start();
        new Y().start();
    }
}

import java.io.IOException;
public class ChainedExpression {
    public static void main(String[] args) {
        try {
            ArithmeticException ae = new ArithmeticException("Exception");
            ae.initCause(new IOException("This is actual cause...."));
            throw ae;
        }
        catch(ArithmeticException ae) {
            System.out.println(ae);
            System.out.println(ae.getCause());
        }
    }
}

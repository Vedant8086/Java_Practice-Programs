public class Binary {
    public static void main(String[] args) {
        int n = 87;
        int mul=1;
        int ans = 0;

        while(n>0) {
            int rem = n %2;
            int quo = n/2;
            ans = ans + rem * mul;
            n = n/2;
            mul = mul *10;
        }
        System.out.println(ans);
    }    
}

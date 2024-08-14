class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println("Rest of code try block");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception =>" + e.getMessage());
        }
    }    
}

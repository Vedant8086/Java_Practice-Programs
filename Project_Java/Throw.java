class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access Granted - You are old Enough!");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
    }
}

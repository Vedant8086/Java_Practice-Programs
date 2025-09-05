import java.util.*;
public class Day2x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ATMSystem();
        // NumSum();
        // ReverseNumber();
        // Triplet();
        // StarPattern();
        // PrimeNumberTill_N();
        // Fizz_Buzz();
        // Pro_Rectangle_Pattern();
        sc.close();
    }   
    public static void Pro_Rectangle_Pattern() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = n + 2;
            int x = (n / 2) - 1;
            for(int i =0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    if(n/2 + 1 <= i) {
                        if(((m/2)+x>=j) && ((m/2)-x<=j)) {
                            System.err.print("   ");
                        } else {
                            System.err.print(" * ");
                        }
                    } else {
                        if((m/2)+i>=j && (m/2)-i<=j) {
                            System.out.print("   ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                }
                if(n/2 + 1 <= i) x--;
                System.out.println();
            }

        }
    }
    public static void StarPattern() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < n;j++) {
                    if(n - 1 - i > j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }        
    }
    public static void Triplet() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > b && a > c) {
                if(Math.pow(a,2) == (Math.pow(b,2)+Math.pow(c,2))) {
                    System.out.println(a+" Square is Equal to Square of "+b + " & "+c);
                } else {
                    System.out.println("They Have No relation");
                }
            } else if(b > a && b > c) { 
                if(Math.pow(b,2) == (Math.pow(c,2)+Math.pow(a,2))) {
                System.out.println(b+" Square is Equal to Square of "+a + " & "+c);
                } else {
                    System.out.println("They Have no relation.");
                }
            } else {
                if(Math.pow(c,2) == (Math.pow(b,2)+Math.pow(a,2))) {
                System.out.println(c+" Square is Equal to Square of "+a + " & "+b);
                } else {
                    System.out.println("They Have no relation.");
                }
            }
        }
    }
    public static void ReverseNumber() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int reverse = 0;
            while(n != 0) {
                int bit = n % 10;
                reverse = (reverse * 10) + bit;
                n /= 10;
            }
            System.out.println("Reverse Number : "+reverse);
        }
    } 
    public static void NumSum() {
        try (Scanner sc = new Scanner(System.in)) {
            int Digit = sc.nextInt();
            int sum = 0;
            while(Digit != 0) {
                sum += (Digit % 10);
                Digit /= 10;
            }
            System.out.println("Sum of numbers : "+sum);
        }
    }
    public static void ATMSystem() {
        try (Scanner sc = new Scanner(System.in)) {
            int Balance = 500;
            while (true) {
                if(Balance == 0) {
                    System.out.println("Balance is 0 Now.");
                }
                System.out.print("1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit\n");
                int n = sc.nextInt();
                if(n == 4) break;
                switch (n) {
                    case 1 -> {
                        System.out.println("Enter the Withdraw amount : ");
                        int amount = sc.nextInt();
                        if((Balance - amount) >= 0) {
                            Balance -= amount;
                        } else {
                            System.out.println("Not sufficient to reduce balance.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter the Amount to Deposit : ");
                        int x = sc.nextInt();
                        Balance += x;
                    }
                    case 3 -> System.out.println("Your Current Balance is "+Balance);
                    default -> System.out.println("enter the valid case.");
                }
            }
        }
    }
    public static void PrimeNumberTill_N() {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            // list.add(2);
            for(int i = 2;i <= x;i++) {
                boolean flag = true;
                for(int v : list) {
                    if(i % v == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    list.add(i);
                }
            }
            
            for(int v : list) {
                System.out.println(v);
            }
        }
    }
    public static void Fizz_Buzz() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(n % 3 == 0) {
                System.out.println("Fizz");
            }else if(n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(n + "!");
            }
        }
    }
}

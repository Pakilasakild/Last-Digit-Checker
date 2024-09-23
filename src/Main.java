import java.util.Scanner;

public class Main {
    public static boolean isValid (int a, int b, int c){
        if (a < 10 || b < 10 || c < 10 || a > 1000 || b > 1000 || c > 1000) {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean hasSameLastDigits (int a, int b, int c){
        if (isValid(a, b, c)) {
            a %= 10;
            b %= 10;
            c %= 10;
            if (a == b && a == c) {
                return true;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number (10-1000): ");
        int first = sc.nextInt();
        System.out.println("Enter the second number (10-1000): ");
        int second = sc.nextInt();
        System.out.println("Enter the third number (10-1000): ");
        int third = sc.nextInt();
        if (hasSameLastDigits(first, second, third)) {
            System.out.println("Yes, there are same last digits");
        }
        else {
            System.out.println("No, there are no same last digits");
        }

    }
}
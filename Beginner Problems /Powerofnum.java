import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long result = 1;

        // Multiply base exponent times
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        Sy

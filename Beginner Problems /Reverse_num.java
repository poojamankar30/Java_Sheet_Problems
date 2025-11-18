import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = Math.abs(num); // handle negative numbers

        while (temp > 0) {
            int digit = temp % 10;     // get last digit
            rev = rev * 10 + digit;    // add to reverse number
            temp = temp / 10;          // remove last digit
        }

        if (num < 0) {
            rev = -rev; // keep negative sign
        }

        System.out.println("Reversed number: " + rev);
    }
}

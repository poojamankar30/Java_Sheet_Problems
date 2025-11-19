import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Enter the digit to count: ");
        int digit = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;  // extract last digit
            if (lastDigit == digit) {
                count++;
            }
            temp = temp / 10;  // remove last digit
        }

        System.out.println("The digit " + digit + " appears " + count + " times.");
    }
}

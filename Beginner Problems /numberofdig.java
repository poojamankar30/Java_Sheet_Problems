import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = Math.abs(num); // to handle negative numbers

        if (temp == 0) {
            count = 1; // 0 has 1 digit
        } else {
            while (temp > 0) {

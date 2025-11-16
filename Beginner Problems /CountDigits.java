public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;   // change the number
        int count = 0;

        while (num != 0) {
            num = num / 10;   // remove last digit
            count++;          // increase count
        }

        System.out.println("Number of digits = " + count);
    }
}

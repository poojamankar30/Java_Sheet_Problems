public class SumEvenNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        // Loop through each element
        for (int num : arr) {
            // Check if the number is even
            if (num % 2 == 0) {
                sum += num;   // add even number to sum
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}

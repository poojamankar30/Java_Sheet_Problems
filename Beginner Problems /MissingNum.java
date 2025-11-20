public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1;  // because one number is missing

        int totalSum = n * (n + 1) / 2;  // sum of numbers from 1 to n

        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number is: " + missing);
    }
}

public class DiagonalSum {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < arr.length; i++) {

            // Main diagonal → arr[i][i]
            mainDiagonal += arr[i][i];

            // Secondary diagonal → arr[i][n-i-1]
            secondaryDiagonal += arr[i][arr.length - 1 - i];
        }

        System.out.println("Main Diagonal Sum: " + mainDiagonal);
        System.out.println("Secondary Diagonal Sum: " + secondaryDiagonal);
        System.out.println("Total Diagonal Sum: " + (mainDiagonal + secondaryDiagonal));
    }
}

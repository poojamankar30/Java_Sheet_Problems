import java.util.Arrays;

public class MergeAndSort {
    public static void main(String[] args) {

        int[] arr1 = {5, 2, 9};
        int[] arr2 = {1, 7, 3};

        // Step 1: create a new array with combined size
        int[] merged = new int[arr1.length + arr2.length];

        // Step 2: copy arr1 into merged
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Step 3: copy arr2 into merged
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        // Step 4: sort the merged array
        Arrays.sort(merged);

        // Step 5: print output
        System.out.println("Merged & Sorted Array: " + Arrays.toString(merged));
    }
}

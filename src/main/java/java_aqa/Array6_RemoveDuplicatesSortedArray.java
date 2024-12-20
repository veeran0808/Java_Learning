package java_aqa;

import java.util.Arrays;

public class Array6_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int uniqueCount = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueCount]) {
                arr[++uniqueCount] = arr[i];
            }
        }

        int[] result = Arrays.copyOf(arr, uniqueCount + 1);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
    }
}

package java_aqa;

public class Array1_ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 0, -5};
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
    }
}

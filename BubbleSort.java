import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        int n = result.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {5, 3, 8, 1};
        System.out.println(Arrays.toString(bubbleSort(data)));
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sort using Selection sort: ");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort(arr);
    }
}

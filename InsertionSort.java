import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter numbers to sort using Insertion sort:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        insertionSort(nums);
    }
}

package ds.lec01;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 6, 7, 4, 2, 3, 1, 8};

        System.out.print("The entered numbers are: ");
        printNumbers(arr);
        sort(arr);
        System.out.print("The sorted numbers are: ");
        printNumbers(arr);
    }

    public static void printNumbers(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    public static void sort(int[] arr) {
        int key = 0;
        for (int j = 1; j < arr.length; j++) {
            key = arr[j];

            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}

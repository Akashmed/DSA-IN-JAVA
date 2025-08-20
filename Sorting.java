public class Sorting {
    static void BubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        printArray(arr, n);
    }

    static void SelectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

        }
        printArray(arr, n);
    }

    static void InsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }

        printArray(arr, n);
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5 };
        InsertionSort(arr, 5);
    }
}

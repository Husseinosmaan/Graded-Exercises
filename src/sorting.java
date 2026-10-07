import java.util.Scanner;

public class sorting{

    static int comparisons = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // Enter elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        // print before sorting
        System.out.println("\nElements before sorting:");
        printArray(arr);

        // Choose sorting algorithm
        System.out.println("\nChoose sorting algorithm:");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Your choice: ");
        int sortChoice = input.nextInt();

        comparisons = 0;

        switch (sortChoice) {
            case 1:
                selectionSort(arr);
                break;
            case 2:
                bubbleSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // print after sorting
        System.out.println("\nElements after sorting:");
        printArray(arr);

        // meeqo comparisons la sameeyay
        System.out.println("Number of comparisons: " + comparisons);

        // raadi element
        System.out.print("\nEnter element to search: ");
        int key = input.nextInt();

        // Choose searching algorithm
        System.out.println("Choose searching algorithm:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Your choice: ");
        int searchChoice = input.nextInt();

        int index = -1;

        if (searchChoice == 1) {
            index = linearSearch(arr, key);
        } else if (searchChoice == 2) {
            index = binarySearch(arr, key);
        } else {
            System.out.println("Invalid choice");
            return;
        }

        // 9. Print result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the elements");
        }

        input.close();
    }

    // ---------- Sorting Algorithms ----------

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
    }

    // ---------- Searching Algorithms ----------

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    // ---------- Utility ----------

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
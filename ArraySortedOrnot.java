public class ArraySortedOrnot {
    static Boolean isSorted(int arr[], int index) {
        // termination case
        if (arr.length - 1 == index) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false; // it is a edge case
        }
        // small problem e hai mere liye ki mei har baar index ko increment karat chaku
        index = index + 1;
        return isSorted(arr, index); // Tail recursion

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int index = 0;
        System.out.println(isSorted(arr, index) ? "Sorted" : "Not sorted");
    }
}

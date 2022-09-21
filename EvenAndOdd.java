public class EvenAndOdd {
    static void swap(int n) {
        // termination case
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n); // pre processing logic
            swap(n - 1); // small problem
        }
        if (n % 2 == 0) {
            swap(n - 1); // post prcessing logic
            System.out.println(n); // small problem
        }
    }

    public static void main(String[] args) {
        swap(5);
    }
}

public class PrintNumber2 {
    static void show(int n) {
        if (n == 0) { // termination case
            return;
        }
        show(n - 1); // small problem
        System.out.println(n); // processing logic during stack fall time
    }

    public static void main(String[] args) {
        show(5);
    }
}

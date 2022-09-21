public class PrintNumber1 {
    static void show(int n) {
        if (n == 0) { // termination case means exit from the function
            return;
        }
        System.out.println(n); // processing logic
        show(n - 1); // small problem
    }

    public static void main(String[] args) {
        show(5);
    }
}

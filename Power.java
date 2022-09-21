public class Power {
    static int power(int n, int p) {
        // termination case
        if (p == 0) {
            return 1;
        }
        // small problem
        int smallResult = power(n, p - 1);
        // processing logic
        return n * smallResult;
    }

    public static void main(String[] args) {
        int result = power(2, 5);
        System.out.println(result);
    }
}

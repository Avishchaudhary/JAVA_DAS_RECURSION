public class Factorial {
    static int fact(int num) {
        // termination case
        if (num == 1) {
            return 1;
        }
        // small problem
        int smallResult = fact(num - 1); // fact(5-1) , fact(4-1).....etc
        // processing logic
        return num * smallResult;
    }

    public static void main(String[] args) {
        int result = fact(5);
        System.out.println(result);
    }
}

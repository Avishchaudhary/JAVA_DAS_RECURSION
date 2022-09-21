public class NumberPattern {
    // make a function pyramid
    static void pyramid(int n, int row) {
        // termination case
        if (n == 0) {
            return;
        }
        // small problem
        printrow(row - n + 1, row - n + 1);
        // processing logic
        System.out.println();
        pyramid(n - 1, row);
    }

    // make a functin print row that print the row
    static void printrow(int num, int val) {
        // terminatuion case
        if (num == 0) {
            return;
        }
        // small problem
        System.out.print(val + " ");
        // processing logic
        printrow(num - 1, val);
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 5;
        pyramid(n, row);
        /*
         * or we can also do as well as
         * int n=5;
         * pyramid(n,n);
         * it will give the same output
         */
    }
}

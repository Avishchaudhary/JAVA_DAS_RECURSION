public class Pattern1 {
    static void leftpyramid(int n, int row) {
        // termination case
        if (row > n) {
            return;
        }
        // processing logic
        printstar(row);
        System.out.println(); // new line move
        // small problem
        leftpyramid(n, row + 1); // isse row increase hoti jaayegi
    }

    static void printstar(int noofstar) {
        // ab yha par ek base case laga do
        if (noofstar == 0) { // termination case
            return;
        }
        // processing logic
        System.out.print("*");
        // small problem
        printstar(noofstar - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        leftpyramid(n, row);
    }
}

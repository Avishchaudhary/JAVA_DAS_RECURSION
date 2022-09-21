public class RightPyramid {
    // make a function rightpyramid
    static void rightpyramid(int num, int row) {
        // termination case
        if (row == 0) {
            return;
        }
        // small problem
        printstar(row);
        // processing logic
        System.out.println();
        rightpyramid(num, row - 1);
    }

    // make a another function printstar top print the star
    static void printstar(int noofstar) {
        if (noofstar == 0) {
            return;
        }
        // small problem
        System.out.print("*");
        // post processing logic
        printstar(noofstar - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        int row = 5;
        // calling a function
        rightpyramid(num, row);
    }
}
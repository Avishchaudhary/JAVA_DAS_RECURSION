public class Pyramid {
    // make a function pyramid
    static void pyramid(int num, int row) {
        // termination case
        if (num == 0) {
            return;
        }
        // small problem
        space(num - 1);
        printstar(row - num + 1);
        // processing logic
        System.out.println();
        pyraid(num - 1, row);
    }

    // make a space function to give the space
    static void space(int space) {
        // termination case
        if (space == 0) {
            return;
        }
        // small problem
        System.out.print(" ");
        // processing logic
        space(space - 1);
    }

    // make a function printstar to print the star
    static void printstar(int noofstar) {
        // termination case
        if (noofstar == 0) {
            return;
        }
        // small problem
        System.out.print("* ");
        // processing logic
        printstar(noofstar - 1);
    }

    public static void main(String[] args) {
        int num = 5;
    }
}

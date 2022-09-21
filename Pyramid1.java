public class Pyramid1 {
    static void pyramid(int num, int row) {
        if (num == 0) {
            return;
        }
        space(num - 1);
        printstar(row - num + 1);
        System.out.println("");
        pyramid(num - 1, row);
    }

    static void space(int space) {
        if (space == 0) {
            return;
        }
        System.out.print(" ");
        space(space - 1);
    }

    static void printstar(int noofstar) {
        if (noofstar == 0) {
            return;
        }
        System.out.print("* ");
        printstar(noofstar - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        pyramid(num, num);
    }
}

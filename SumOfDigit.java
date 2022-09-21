public class sumofdigit {
    static int sumofdigit(int num, int sum) {
        // termination case
        if (num == 0) {
            return sum;
        }
        // processing logic
        int r = num % 10;
        sum += r;
        // small problem
        num = num / 10; // abki baar ye number chota ho jaye
        return sumofdigit(num, sum);
    }

    public static void main(String[] args) {
        int num = 123;
        int result = sumofdigit(num, 0);
        System.out.println(result);
    }
}
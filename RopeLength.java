public class RopeLength {
    static int ropecut(int ropelength, int a, int b, int c) {
        // termination case
        if (ropelength == 0) {
            return 0;
        }
        // edge case
        if (ropelength < 0) {
            return -1;
        }
        // ek final count variable banake aate hai
        // to sabse pehle cut hum a ka lenge
        int acut = ropecut(ropelength - a, a, b, c);
        int bcut = ropecut(ropelength - b, a, b, c);
        int ccut = ropecut(ropelength - c, a, b, c);
        int max = (int) Math.max(acut, bcut); // (int)this is typecast
        max = (int) Math.max(max, ccut);

        if (max == -1) {
            return -1; // iska matlab hai ki agar vo jayada deep chala jaye or usko jayada baar minus
                       // hi milta jaye to vo humko minus hi return karde bus.
        }

        return max + 1; // ye basically kya hai jab hum ek baar minus karke aata hu to mei fir plus 1
                        // jata hu
    }

    public static void main(String[] args) {
        int count = ropecut(23, 12, 9, 11);
        System.out.println(count);
    }
}

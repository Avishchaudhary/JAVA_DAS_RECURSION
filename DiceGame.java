import java.util.ArrayList;

public class DiceGame {
    static ArrayList<String> ReachToTen(int currentValue, int endValue) {
        // termination case
        if (currentValue == endValue) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // case 1
        if (currentValue > endValue) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> finallist = new ArrayList<>();
        // dice roll 1 to 6 times
        for (int dice = 1; dice <= 6; dice++) {
            // small problem-is case mei mere pass small problem hai ki mujhe jo bhi value
            // aayege dice roll karne ke baad mujhe vo add karke chalni hai
            // current value+dice
            int newvalue = dice + currentValue;
            // ab jab ye new value ban gauyi to ab isko call lagana chaiyee recursively
            // function ko
            ArrayList<String> result = ReachToTen(newvalue, endValue);
            for (String s : result) {
                finallist.add(s + dice);
            }
        }
        return finallist;
    }

    public static void main(String[] args) {
        ArrayList<String> results = ReachToTen(0, 10);
        System.out.println(results);
    }
}

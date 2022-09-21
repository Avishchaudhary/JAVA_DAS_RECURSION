import java.util.ArrayList;

public class MazePathProblem {
    static ArrayList<String> getmazepath(int currentcol, int endcol, int currentrow, int endrow) {
        // termination case
        if (currentcol == endcol && currentrow == endrow) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // edge case
        if (currentcol > endcol || currentrow > endrow) { // ||or yaani either
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        // small problem-iski small problem bus itni si hogi ki agar hum row ko
        // implement karde yaa col ko increment karde so we break small problem in two
        // ways

        ArrayList<String> finallist = new ArrayList<>();
        // horizontally increment
        ArrayList<String> hresult = getmazepath(currentcol + 1, endcol, currentrow, endrow);
        for (String s : hresult) {
            finallist.add("H" + s);
        }
        // vertically increment
        ArrayList<String> vresult = getmazepath(currentcol, endcol, currentrow + 1, endrow);
        for (String s : vresult) {
            finallist.add("V" + s);
        }
        return finallist;
    }

    public static void main(String[] args) {
        System.out.println(getmazepath(0, 3, 0, 3));
    }
}

import java.util.ArrayList;

public class MazePathByDiogonaly {
    static ArrayList<String> Maze(int currentcol, int endcol, int currentrow, int endrow) {
        // termination case
        if (currentcol == endcol && currentrow == endrow) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // edge case
        if (currentcol > endcol || currentrow > endrow) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        // small problem
        ArrayList<String> finallist = new ArrayList<>();
        // horizontally increment
        ArrayList<String> hresult = Maze(currentcol + 1, endcol, currentrow, endrow);
        for (String s : hresult) {
            finallist.add("H" + s);
        }
        // vertically increment
        ArrayList<String> vresult = Maze(currentcol, endcol, currentrow + 1, endrow);
        for (String s : vresult) {
            finallist.add("V" + s);
        }
        // diogonaly increment
        ArrayList<String> dresult = Maze(currentcol + 1, endcol, currentrow + 1, endrow);
        for (String s : dresult) {
            finallist.add("D" + s);
        }
        return finallist;
    }

    public static void main(String[] args) {
        ArrayList<String> results = Maze(0, 3, 0, 3);
        System.out.println(results);
    }
}

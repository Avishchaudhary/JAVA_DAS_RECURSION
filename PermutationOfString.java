import java.util.ArrayList;

public class PermutationOfString {
    static ArrayList<String> permutation(String str) {
        // termination case
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        // get a singlechar (or ye kab kaam aayega jab stackm fall hora ho)
        char singlechar = str.charAt(0);
        // make a string small problem (yaani ye hi hamara small problem banega)
        String substring = str.substring(1);
        // calling a function
        ArrayList<String> result = permutation(substring);
        ArrayList<String> finallist = new ArrayList<>();
        // we crteate a permutation
        for (String s : result) {
            for (int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, singlechar); // yha par humne space ke sath c to laga diya
                finallist.add(sb.toString());
            }
        }
        return finallist;
    }

    public static void main(String[] args) {
        // ArrayList<String> results = permutation("abc");
        System.out.println(permutation("abc"));
    }
}

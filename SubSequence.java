import java.util.ArrayList;

public class SubSequence {
    // make a array list
    static ArrayList<String> getsubsequence(String name) {
        // termination case
        if (name.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(" ");// wreturn a arraylist with blank
            return list;
        }
        // get the single character which is used to join in array list when stack fall
        char singlechar = name.charAt(0);
        // now make the string small till we raeach to empty string
        // to make it string small we do substring
        String substring = name.substring(1);// pick string from fitst index till end yaani ye first ko chod kar baaki
                                             // sub ki pick karke aa jaye ga jais eki humne rafly samja tha.
        // ab bus recursively call lagate chalo yaani bula lo function

        // processing logic
        ArrayList<String> result = getsubsequence(substring);
        // ab basically mujhe blank ke sath top of the element yaani blank ke sath kn
        // baitha hai vo baitha hai t or mujhe ukso add karna hait ko blank ke sath mei
        // add bhi karna hai list mei

        // or fir ye stack k fall karta jaayega

        // a mujhe ye karna hai ki is array list mei se nikalkar mujhe further ek new
        // array list banani hai hum isi mei ye nahi kar sakte kyoki ye read bhi hori or
        // write bhi hori to ye concrade ho jaayegi that's why we create a new array
        // list

        ArrayList<String> finalresult = new ArrayList<>();
        for (String s : result) {
            finalresult.add(s);// not include the first char
            finalresult.add(singlechar + s);// include the first char
        }
        return finalresult;
    }

    public static void main(String[] args) {
        // calling a functiion
        ArrayList<String> results = getsubsequence("amit");
        System.out.println(results);
        // String name="amit";
    }
}

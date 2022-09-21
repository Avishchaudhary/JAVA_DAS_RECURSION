public class ReverseString {
    static String reverse(String str) {
        // termination case
        if (str.length() == 1) {
            return String.valueOf(str.charAt(0));
        }
        // aisaiye karna pad rha hai kyoki mere pass ek character bacha hua hoga
        // or vahi meio return karke aaunga or vo char hoga or mujhe to string mei
        // convert karke return karana hai naa kyoki yer direct concat hoga naa
        // result mei

        // small problem
        String smallstring = str.substring(1); // isse hum string se single character nikalkar rajh lete hai

        // processing logic

        // or isi moment par maine uska single char bhi retain karke rakh liya
        char singlechar = str.charAt(0);

        // ab hum chahate hai ki function ko baar baar call lagaya jaye
        return reverse(smallstring) + singlechar;
    }

    public static void main(String[] args) {
        String str = "tim";
        String result = reverse(str);
        System.out.println(result);
    }
}

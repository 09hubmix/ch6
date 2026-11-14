import java.util.Scanner;

public class PigLatin {

    public static String pigWord(String word) {
        if (word.length() > 2) {
            return word.substring(1) + word.substring(0, 1) + "ay";
        }
        return word;
    }

    public static String pigLatin(String msg) {
        String result = "";
        while (msg.indexOf(" ") >= 0) {
            String word = msg.substring(0, msg.indexOf(" "));
            result += pigWord(word) + " ";
            msg = msg.substring(msg.indexOf(" ") + 1);
        }
        result += pigWord(msg);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(pigLatin(in.nextLine()));
    }
}

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str) {
        str = removeNonLetters(str);
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String removeNonLetters(String str) {
        String nonLetters = "!@#$%^&*()_-+=/?.>,<\\|[{}]~`;:\"' ";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String current = str.substring(i, i + 1);
            if (!nonLetters.contains(current)) {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (isPalindrome(in.nextLine())) {
            System.out.println("That is a palindrome.");
        } else {
            System.out.println("That is not a palindrome.");
        }
    }
}

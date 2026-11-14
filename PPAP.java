import java.util.Scanner;

public class PPAP {

    public static String ppap(String str) {
        String a = str.substring(9, str.indexOf(","));
        String b = str.substring(str.lastIndexOf(" ") + 1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        return "Uh! " + b + " " + a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(ppap(in.nextLine()));
    }
}

import java.util.Scanner;

public class Binary {

    public static String convertToBinary(int num) {
        String bin = "";
        while (num != 0) {
            int remainder = num % 2;
            num = num / 2;
            bin = remainder + bin;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(convertToBinary(in.nextInt()));
    }
}

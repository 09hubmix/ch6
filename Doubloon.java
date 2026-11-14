public class Doubloon {

    public static boolean isDoubloon(String s) {
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDoubloon("Mimi"));    
        System.out.println(isDoubloon("Caucasus")); 
        System.out.println(isDoubloon("hello"));  
    }
}

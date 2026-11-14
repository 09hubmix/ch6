public class Abecedarian {

    public static void main(String[] args) {
        System.out.println(isAbecedarian("biopsy"));  
        System.out.println(isAbecedarian("chintz"));  
        System.out.println(isAbecedarian("hello"));  
        System.out.println(isAbecedarian("abc"));     
        System.out.println(isAbecedarian("a"));     
    }

    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;   
            }
        }
        return true;            
    }
}

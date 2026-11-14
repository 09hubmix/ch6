public class Scrabble {

    public static boolean canSpell(String tiles, String word) {
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = tiles.indexOf(letter);
            if (index == -1) {
                return false;
            }
            tiles = tiles.substring(0, index) + tiles.substring(index + 1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canSpell("quijibo", "jib"));
        System.out.println(canSpell("quijibo", "quiz"));  
        System.out.println(canSpell("quijibo", "bob"));   
        System.out.println(canSpell("quijibo", "bobb"));  
    }
}

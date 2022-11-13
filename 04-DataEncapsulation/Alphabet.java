public class Alphabet {
    static boolean isAlphabet(String t) {
        boolean sorted = true;
        for (int i = 1; i < t.length() - 1; i++) {
            if (t.charAt(i) >= t.charAt(i + 1)) {
                sorted = false;
            }
        }   
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Alphabet.isAlphabet("abegsw"));
        System.out.println(Alphabet.isAlphabet("abcmhws"));
    }
}
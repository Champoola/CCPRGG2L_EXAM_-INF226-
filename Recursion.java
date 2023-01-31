public class Recursion {

    public static void main(String[] args) {
        String fullName = " dhan lloyd ferrer";
        removeConsonants(fullName);
    }

    static void removeConsonants(String str) {
        if (str.length() == 0) {
            return;
        }

        char firstLetter = str.charAt(0);
        if (firstLetter != 'a' && firstLetter != 'e' && firstLetter != 'i' && firstLetter != 'o' && firstLetter != 'u') {
            System.out.println(str.substring(1));
            removeConsonants(str.substring(1));          
        } else {
            System.out.print(firstLetter);
            removeConsonants(str.substring(1));
        }
    }
}
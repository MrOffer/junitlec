public class CodeupCrypt {
    public static String hash;
    String[] vowels = {"a", "e", "i", "o", "u"};

    public static String encrypt() {
        return "f3r";
    }

    public static String checkPassword(String password) {
        String hash = "";
        for (String letter : hash.split("")) {
            for (char character : password.toCharArray()) {
                switch (character) {
                    case 'a':
                    case 'A':
                        hash += 4;
                        break;
                    case 'e':
                    case 'E':
                        hash += 3;
                        break;
                    case 'i':
                    case 'I':
                        hash += 1;
                        break;
                    case 'o':
                    case 'O':
                        hash += 0;
                        break;
                    case 'u':
                    case 'U':
                        hash += 9;
                        break;
                    default:
                        hash += character;
                }
            }
        }
        return hash;

    }
}

public class CaesarCipher {
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int shift = 3;
                if (Character.isUpperCase(c)) {
                    encryptedText.append((char) ('A' + (c - 'A' + shift) % 26));
                } else {
                    encryptedText.append((char) ('a' + (c - 'a' + shift) % 26));
                }
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
    
    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                int shift = 23;
                if (Character.isUpperCase(c)) {
                    decryptedText.append((char) ('A' + (c - 'A' + shift) % 26));
                } else {
                    decryptedText.append((char) ('a' + (c - 'a' + shift) % 26));
                }
            } else {
                decryptedText.append(c);
            }
        }
        return decryptedText.toString();
    }
}

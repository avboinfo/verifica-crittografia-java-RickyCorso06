public class Cryptographer {
    public static void encryptFile(String fileName) {
        String content = FileIO.readFile(fileName);
        if (content != null) {
            String encryptedContent = CaesarCipher.encrypt(content);
            encryptedContent = xorEncrypt(encryptedContent);
            FileIO.writeFile(fileName, encryptedContent);
            System.out.println("Contenuto criptato e salvato nel file.");
        }
    }
    
    public static void decryptFile(String fileName) {
        String content = FileIO.readFile(fileName);
        if (content != null) {
            String decryptedContent = xorDecrypt(content);
            decryptedContent = CaesarCipher.decrypt(decryptedContent);
            FileIO.writeFile(fileName, decryptedContent);
            System.out.println("Contenuto decriptato e salvato nel file.");
        }
    }
    
    public static String xorEncrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            encryptedText.append((char) (text.charAt(i) ^ 42)); 
        }
        return encryptedText.toString();
    }
    
    public static String xorDecrypt(String text) {
        return xorEncrypt(text); 
    }
}

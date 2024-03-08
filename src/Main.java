import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "test.txt"; 
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("0. Uscita");
            System.out.println("1. Cripta il contenuto");
            System.out.println("2. Decripta il contenuto");
            System.out.println("3. Stampa il contenuto");
            System.out.print("Scelta: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Uscita...");
                    return;
                case 1:
                    Cryptographer.encryptFile(fileName);
                    break;
                case 2:
                    Cryptographer.decryptFile(fileName);
                    break;
                case 3:
                    FileIO.printFileContent(fileName);
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }
        }
    }
}

/*
 * Vigenere Cipher is  a method of encrypting alphabetic text. 
 * It uses a simple form of polyalphabetic substitution. 
 * A polyalphabetic cipher is any cipher based on substitution, using multiple substitution alphabets .
 * The encryption of the original text is done using the Vigenère square or Vigenère table.
 * Vigenere Cipher Encryption and Decryption Algorithm in Java
 */
import java.util.Scanner;

public class vigenere_cipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase();
        System.out.print("Enter the key: ");
        String key = scanner.nextLine().toUpperCase();
        String ciphertext = encryptVigenere(plaintext, key);
        System.out.println("Encrypted Text: " + ciphertext);
        String decryptedText = decryptVigenere(ciphertext, key);
        System.out.println("Decrypted Text: " + decryptedText);
        scanner.close();
    }

    private static String encryptVigenere(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();
        int keyIndex = 0;

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) ((c + key.charAt(keyIndex) - 2 * 'A') % 26 + 'A');
                ciphertext.append(encryptedChar);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }

    private static String decryptVigenere(String ciphertext, String key) {
        StringBuilder decryptedText = new StringBuilder();
        int keyIndex = 0;

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) ((c - key.charAt(keyIndex) + 26) % 26 + 'A');
                decryptedText.append(decryptedChar);
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }
}

/*
 * Rot13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet.
 * Rot13 is an example of the Caesar cipher, developed in ancient Rome.
 * Here is the code for Rot13 cipher in Java:
 */

import java.util.Scanner;

public class rot13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the plaintext: ");
        String plaintext = scanner.nextLine().toUpperCase();
        String ciphertext = encryptRot13(plaintext);
        System.out.println("Encrypted Text: " + ciphertext);
        String decryptedText = decryptRot13(ciphertext);
        System.out.println("Decrypted Text: " + decryptedText);
        scanner.close();
    }

    private static String encryptRot13(String plaintext) {
        StringBuilder ciphertext = new StringBuilder();

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                char encryptedChar = (char) ((c - 'A' + 13) % 26 + 'A');
                ciphertext.append(encryptedChar);
            } else {
                ciphertext.append(c);
            }
        }

        return ciphertext.toString();
    }

    private static String decryptRot13(String ciphertext) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) ((c - 'A' + 13) % 26 + 'A');
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }
}
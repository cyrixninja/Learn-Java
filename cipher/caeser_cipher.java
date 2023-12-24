/*
 * Caeser Cipher Encryption and Decryption Algorithm in Java
 */

import java.util.Scanner;

public class caeser_cipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the message: ");
        String message = sc.nextLine();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        String encrypted = encrypt(message, key);
        System.out.println("Encrypted message: " + encrypted);
        System.out.println("Decrypted message: " + decrypt(encrypted, key));
        sc.close();
    }

    public static String encrypt(String message, int key) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + key);
                    if (c > 'Z') {
                        encrypted += (char) (ch - (26 - key));
                    } else {
                        encrypted += c;
                    }
                } else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + key);
                    if (c > 'z') {
                        encrypted += (char) (ch - (26 - key));
                    } else {
                        encrypted += c;
                    }
                }
            } else {
                encrypted += ch;
            }
        }
        return encrypted;
    }

    public static String decrypt(String encrypted, int key) {
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char c = (char) (ch - key);
                    if (c < 'A') {
                        decrypted += (char) (ch + (26 - key));
                    } else {
                        decrypted += c;
                    }
                } else if (Character.isLowerCase(ch)) {
                    char c = (char) (ch - key);
                    if (c < 'a') {
                        decrypted += (char) (ch + (26 - key));
                    } else {
                        decrypted += c;
                    }
                }
            } else {
                decrypted += ch;
            }
        }
        return decrypted;
    }
}
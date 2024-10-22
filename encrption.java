

import java.util.Scanner;

/**
 *
 * @author B0AliSS
 */
public class Encrption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select encription Algrithm : "
                + "\n1 -  Caesar cipher. \n"
                + "2 - Substitution Cipher");
        int selection = scanner.nextInt();
        System.out.print("plain text : ");
        scanner.nextLine();
        String plain = scanner.nextLine();
//                scanner.nextLine();

        switch (selection) {
            case 1:
                System.out.println();
                String res = CaesarCipher(plain);
                System.out.println("cipher text :" + res);
                break;
            case 2:
                System.out.print("key : ");
                int key = scanner.nextInt();
                String res2 =SubstitutionCipher(plain, key);
                System.out.println("cipher text :" + res2);

                break;
            default:
                break;
        }
    }

    public static String CaesarCipher(String plain) {
        String cipher = "";
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) != ' ') {
                if (Character.isUpperCase(plain.charAt(i))) {
                    int ciphchar = ((((int) plain.charAt(i)) - 65) + 3) % 26;
                    ciphchar += 65;
                    cipher += (char) ciphchar;
                } else {
                     int ciphchar = ((((int) plain.charAt(i)) - 97) + 3) % 26;
                    ciphchar += 97;
                    cipher += (char) ciphchar;
                }

            } else {
                cipher += ' ';
            }
        }
        return cipher;

    }

    private static String SubstitutionCipher(String plain, int key) {
        String cipher = "";
        for (int i = 0; i < plain.length(); i++) {
            if (plain.charAt(i) != ' ') {
                if (Character.isUpperCase(plain.charAt(i))) {
                    int ciphchar = ((((int) plain.charAt(i)) - 65) + key) % 26;
                    ciphchar += 65;
                    cipher += (char) ciphchar;
                } else {
                     int ciphchar = ((((int) plain.charAt(i)) - 97) + key) % 26;
                    ciphchar += 97;
                    cipher += (char) ciphchar;
                }

            } else {
                cipher += ' ';
            }
        }
        return cipher;
    }

}



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
                + "\n1 -  Caesar cipher. \n");
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

   

}

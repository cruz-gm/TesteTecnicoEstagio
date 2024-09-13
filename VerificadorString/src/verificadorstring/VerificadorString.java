package verificadorstring;

import java.util.Scanner;

/**
 * @author Guilherme
 */
public class VerificadorString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Latin1");

        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }

}

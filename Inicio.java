import java.util.Scanner;
import java.util.Locale;

public class Inicio {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("----------------------------");
        System.out.println("        MORTAL FIGHT        ");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("[1] Start Game");
        System.out.println("[2] Instructions");
        System.out.println("[3] Exit Game");
        System.out.println();
        System.out.println("----------------------------");
        
        System.out.print("Select: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        scanner.close();
    }
}
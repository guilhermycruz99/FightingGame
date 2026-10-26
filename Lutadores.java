import java.util.Scanner;
import java.util.Locale;

public class Lutadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("    Select your Character   ");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("[1] BLANKA");
        System.out.println("Damage: 20  | Life: 350  |  Special: 100");
        System.out.println();
        System.out.println("[2] MUSASHI");
        System.out.println("Damage: 25  | Life: 200  |  Special: 250");
        System.out.println();
        System.out.println("[3] SUBZERO");
        System.out.println("Damage: 20  | Life: 250  |  Special: 300");
        System.out.println();
        System.out.println("[4] DEATHSTROKE");
        System.out.println("Damage: 30  | Life: 250  |  Special: 200");
        System.out.println();
        System.out.println("[0] Back");
        System.out.println("----------------------------");
        System.out.println();

        System.out.print("Select: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();
    }
}

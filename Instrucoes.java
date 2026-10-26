import java.util.Scanner;
import java.util.Locale;

public class Instrucoes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("        Intructions        ");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println("= Escolha seu lutador.");
        System.out.println("= Vença todos os inimigos.");
        System.out.println("= Tenha cuidado com a quantidade de vida.");
        System.out.println("= Após 3 turnos libera um uso de especial por adversário.");
        System.out.println("= Derrote o Boss e vença o torneio.");
        System.out.println();
        System.out.println("    Boa sorte e que vença o melhor!!!   ");
        System.out.println();
        System.out.println("[0] Back");
        System.out.println("----------------------------");
        System.out.println();

        System.out.print("Select: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        scanner.close();
    }
}

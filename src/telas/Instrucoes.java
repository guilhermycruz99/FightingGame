package src.telas;

import java.util.Scanner;

public class Instrucoes {
    public int exibirInstrucoes(Scanner scanner) {

        System.out.println();
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

        while (opcao != 0) {
            System.out.println("Invalid option! Try again");
            System.out.println();
            System.out.print("Select: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.println();
        return opcao;
    }
}

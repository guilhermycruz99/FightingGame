package src.telas;

import java.util.Scanner;

public  class Inicio {

    public void exibirMenu() {
        Scanner scanner = new Scanner (System.in);
        boolean executar = true;

        while (executar) {
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

            if (opcao == 1) {
                Jogar menuJogar = new Jogar();
                menuJogar.exibirJogo();

            } else if (opcao == 2) {
                Instrucoes menuInstrucoes = new Instrucoes();
                menuInstrucoes.exibirInstrucoes(scanner);

            } else if (opcao == 3) {
                executar = false;
                System.out.println();
                System.out.println("-------- Close Game --------");

            } else {
                System.out.println("Invalid option! Try again");
                System.out.println();
            }
        }
    }
}

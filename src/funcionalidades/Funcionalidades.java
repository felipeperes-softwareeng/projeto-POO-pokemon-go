package funcionalidades;

import java.util.Scanner;

public class Funcionalidades {

    Scanner sc = new Scanner(System.in);

    public int verificarOpcao(int minimo, int maximo) {

        System.out.print("-> ");
        int opcao = sc.nextInt();

        while (opcao > maximo || opcao < minimo) {

            System.out.println("Digite um valor entre "
                    + minimo + " e " + maximo);

            System.out.print("-> ");
            opcao = sc.nextInt();
        }

        sc.nextLine(); // limpa o Enter deixado pelo nextInt()

        return opcao;
    }

    public boolean simOuNao() {

        String escolha = sc.nextLine().toLowerCase();

        while (!escolha.equals("s") && !escolha.equals("n")) {

            System.out.println("Digite apenas s ou n:");
            System.out.print("-> ");

            escolha = sc.nextLine().toLowerCase();
        }

        return escolha.equals("s");
    }
}

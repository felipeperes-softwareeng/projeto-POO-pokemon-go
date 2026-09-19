package funcionalidades;

import com.pokemon.entity.Inventario;
import com.pokemon.entity.Pokemon;

import java.util.Scanner;

public class Funcionalidades {

    Scanner sc = new Scanner(System.in);

    public void entrarEmCombate(Pokemon inimigo, Inventario inventario){
        System.out.println("Você entrou em combate com o " + inimigo.getNome());

        Pokemon pokemonEscolhido = inventario.escolherPokemonBatalha();

        if (pokemonEscolhido == null){
            return;
        }

        while(inimigo.getHp() > 0){

            while(pokemonEscolhido.getHp() > 0 && inimigo.getHp() > 0){

                System.out.println("O que deseja fazer?\n" +
                        "1 - Entrar em combate\n" +
                        "2 - Verificar estatísticas\n" +
                        "0 - Fugir");
                int opcao = verificarOpcao(0, 2);

                if (opcao == 0){
                    System.out.println("Você fugiu da batalha");
                    return;
                }
                else if (opcao ==2){
                    inimigo.mostrarPokemon();
                }
                else if (opcao == 1){

                    pokemonEscolhido.atacar(inimigo);

                    if (inimigo.getHp() == 0){
                        System.out.println("Você venceu! Deseja recrutar "+ inimigo.getNome() + " para seu inventário? (s/n)");
                        boolean resposta = simOuNao();
                        if(resposta){
                            inventario.adicionarPokemon(inimigo);
                        }
                        pokemonEscolhido.subirNivel();
                        return;
                    }

                    System.out.println("Turno do inimigo");
                    inimigo.atacar(pokemonEscolhido);

                }


            }
            pokemonEscolhido = inventario.escolherPokemonBatalha();
            if (pokemonEscolhido == null){
                return;
            }
        }
    }

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

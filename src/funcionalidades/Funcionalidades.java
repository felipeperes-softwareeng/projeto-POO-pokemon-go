package funcionalidades;

import com.pokemon.entity.Inventario;
import com.pokemon.entity.Pokemon;

import java.util.Scanner;

public class Funcionalidades {

    Scanner sc = new Scanner(System.in);

    public void entrarEmCombate(Pokemon inimigo, Inventario inventario){
        System.out.println("Você entrou em combate com o " + inimigo.getNome());

        Pokemon pokemonEscolhido = inventario.escolherPokemonBatalha(); //aciona a função de escolher o pokemon para a batalha

        if (pokemonEscolhido == null){
            return;
        }

        while(inimigo.getHp() > 0){

            while(pokemonEscolhido.getHp() > 0 && inimigo.getHp() > 0){ //loop

                System.out.println("O que deseja fazer?\n" +
                        "1 - Atacar\n" +
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

                    if (inimigo.getHp() == 0){ //Após o termino da batalha, tem a opcao de adicionar ou nao o pokemon ao seu inv
                        System.out.println("Você venceu! Deseja recrutar "+ inimigo.getNome() + " para seu inventário? (s/n)");
                        boolean resposta = simOuNao();
                        if(resposta){
                            inventario.adicionarPokemon(inimigo);
                        }
                        pokemonEscolhido.subirNivel(); // Após o término, é evoluido o pokemon que batalhou
                        return;
                    }

                    System.out.println("Turno do inimigo");
                    inimigo.atacar(pokemonEscolhido); // caso o pokemon inimigo nao tenha sido derrotado, vai para o turno dele

                }


            }
            pokemonEscolhido = inventario.escolherPokemonBatalha();
            if (pokemonEscolhido == null){
                return;
            }
        }
    }

    public int verificarOpcao(int minimo, int maximo) { // verifica opcao , por exemplo, 0, 1, 2

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

    public boolean simOuNao() { // Funcionalidade s/n

        String escolha = sc.nextLine().toLowerCase();

        while (!escolha.equals("s") && !escolha.equals("n")) {

            System.out.println("Digite apenas s ou n:");
            System.out.print("-> ");

            escolha = sc.nextLine().toLowerCase();
        }

        return escolha.equals("s");
    }
}

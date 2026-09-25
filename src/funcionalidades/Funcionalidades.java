package funcionalidades;
import com.pokemon.entity.Inventario;
import com.pokemon.entity.Pokemon;
import com.pokemon.entity.index.Pikachu;
import java.util.Scanner;

public class Funcionalidades {

    //abre scanner
    private Scanner sc = new Scanner(System.in);

    //funcao entrar em combate
    public void entrarEmCombate(Pokemon inimigo, Inventario inventario){
        // Informa qual pokemon inimigo foi encontrado
        System.out.println("Você esbarrou com o " + inimigo.getNome());

        // O jogador escolhe qual pokemon do inventario irá batalhar
        Pokemon pokemonEscolhido = inventario.escolherPokemonBatalha();

        // Se não existir nenhum pokemon disponível, a batalha é encerrada
        if (pokemonEscolhido == null){
            return;
        }

        // A batalha continua enquanto o inimigo possuir HP
        while(inimigo.getHp() > 0){

            // Exibe as opções disponíveis durante a batalha
            while(pokemonEscolhido.getHp() > 0 && inimigo.getHp() > 0){

                System.out.println("O que deseja fazer?");
                System.out.println("1 - Atacar");
                System.out.println("2 - Verificar estatísticas");

                int opcaoMaxima = 2;

                if (pokemonEscolhido instanceof Pikachu){

                    System.out.println("3 - Usar Choque Especial");

                    opcaoMaxima = 3;
                }

                System.out.println("0 - Fugir");

                int opcao = verificarOpcao(0, opcaoMaxima);

                if (opcao == 0){

                    System.out.println("Você fugiu da batalha");

                    return;
                }

                else if (opcao == 2){

                    inimigo.mostrarPokemon();
                }

                else if (opcao == 1 || opcao == 3){

                    if (opcao == 1){

                        pokemonEscolhido.atacar(inimigo);
                    }

                    else if (opcao == 3){

                        if (pokemonEscolhido instanceof Pikachu){

                            Pikachu pikachu = (Pikachu) pokemonEscolhido;

                            pikachu.usarChoqueEspecial(inimigo);
                        }
                    }

                    if (inimigo.getHp() == 0){

                        System.out.println(
                                "Você venceu! Deseja recrutar "
                                        + inimigo.getNome()
                                        + " para seu inventário? (s/n)"
                        );

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
                derrota();
            }
        }
    }
    public void derrota() {

        System.out.println("""
            
            ╔════════════════════════════════════╗
            ║             GAME OVER              ║
            ╚════════════════════════════════════╝
            
            Todos os seus Pokémons foram derrotados!
            Sua jornada chegou ao fim :(
            
            Obrigado por jogar!
            """);

        System.exit(0);
    }

    public int verificarOpcao(int minimo, int maximo) {

        System.out.print("-> ");

        int opcao = sc.nextInt();

        while (opcao > maximo || opcao < minimo) {

            System.out.println(
                    "Digite um valor entre "
                            + minimo
                            + " e "
                            + maximo
            );

            System.out.print("-> ");

            opcao = sc.nextInt();
        }

        sc.nextLine();

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
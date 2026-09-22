import com.pokemon.entity.Inventario;
import com.pokemon.entity.Pokemon;
import com.pokemon.entity.index.*;
import funcionalidades.Funcionalidades;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Inventario inventario = new Inventario();

        //Pokemons iniciais
        Pokemon charmander = new Charmander();
        Pokemon bubassauro = new Bubassauro();
        Pokemon squirtle = new Squirtle();

        //Pokemons
        Pokemon magikarp = new Magikarp();
        Pokemon pikachu = new Pikachu();

        boolean fase1 = true;
        boolean fase2 = true;
        boolean fase3 = true;
        boolean fase4 = true;
        boolean fase5 = true;

        Funcionalidades funcionalidades = new Funcionalidades();
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("Olá, viajante! Seja bem vindo(a) ao universo de pokemon!\n" +
                           "--------------------------------------------------------\n" +
                           "1 - Iniciar\n" +
                           "0 - Sair");
        opcao = funcionalidades.verificarOpcao(0, 1);
        if(opcao == 0){
            System.exit(0);
        }
        else if (opcao == 1){

            System.out.println("""
        
        ╔══════════════════════════════════════════════════════════════╗
        ║                    🌟 MUNDO POKÉMON 🌟                       ║
        ╚══════════════════════════════════════════════════════════════╝
        
        Você é um jovem viajante que decidiu deixar sua cidade natal
        para explorar um mundo repleto de mistérios, aventuras e,
        principalmente, Pokémon!
        
        Seu objetivo é viajar por diferentes regiões, encontrar
        Pokémon selvagens, enfrentar outros treinadores e construir
        uma equipe capaz de superar todos os desafios que surgirem
        pelo caminho.
        
        Mas toda grande jornada começa com uma escolha...
        
        Antes de partir, você precisa escolher seu primeiro Pokémon.
        O Professor está diante de você com três Pokébolas.
        
        Dentro delas estão três Pokémon muito especiais:
        
        ┌───────────────┬──────────────┬─────────────────────────────┐
        │ Opção         │ Pokémon      │ Tipo                        │
        ├───────────────┼──────────────┼─────────────────────────────┤
        │ 1             │ Bulbassauro  │ Planta / Veneno             │
        │ 2             │ Charmander   │ Fogo                        │
        │ 3             │ Squirtle     │ Água                        │
        └───────────────┴──────────────┴─────────────────────────────┘
        
        Antes de escolher, você pode conhecer melhor cada Pokémon:

        """);
            while(true){

                System.out.println("""
        
        ┌─────────────────────────────────────────────────────────────┐
        │                         MENU                                │
        ├─────────────────────────────────────────────────────────────┤
        │ 1 - Ver estatísticas do Bulbassauro                         │
        │ 2 - Ver estatísticas do Charmander                          │
        │ 3 - Ver estatísticas do Squirtle                            │
        │ 4 - Escolher Bulbassauro                                    │
        │ 5 - Escolher Charmander                                     │
        │ 6 - Escolher Squirtle                                       │
        │ 0 - Sair                                                    │
        └─────────────────────────────────────────────────────────────┘
        
        Sua jornada está prestes a começar...
        
        Escolha uma opção:
        """);

                opcao = funcionalidades.verificarOpcao(0, 6);

                if (opcao == 0){
                    System.exit(0);
                }

                else if (opcao == 1){
                    bubassauro.mostrarPokemon();
                }

                else if (opcao == 2){
                    charmander.mostrarPokemon();
                }

                else if (opcao == 3){
                    squirtle.mostrarPokemon();
                }

                else if (opcao == 4){
                    System.out.println("Tem certeza que deseja escolher Bubassauro como seu pokemon inicial? (s/n)");
                    boolean escolha = funcionalidades.simOuNao();
                    if (escolha){
                        inventario.adicionarPokemon(bubassauro);
                        break;
                    }
                }
                else if (opcao == 5){
                    System.out.println("Tem certeza que deseja escolher Charmander como seu pokemon inicial? (s/n)");
                    boolean escolha = funcionalidades.simOuNao();
                    if (escolha){
                        inventario.adicionarPokemon(charmander);
                        break;
                    }
                }
                else if (opcao == 6){
                    System.out.println("Tem certeza que deseja escolher Squirtle como seu pokemon inicial? (s/n)");
                    boolean escolha = funcionalidades.simOuNao();
                    if (escolha){
                        inventario.adicionarPokemon(squirtle);
                        break;
                    }
                }

            }

            while(true){
                System.out.println("""
                           O que deseja fazer?
                           1 - Explorar o mundo
                           2 - Curar os pokemons
                           3 - Ver o inventário
                           0 - Sair
                           """);
                opcao = funcionalidades.verificarOpcao(0, 3);
                if (opcao == 0){
                    break;
                }
                else if (opcao == 1){

                    if(fase1){
                        funcionalidades.entrarEmCombate(magikarp, inventario);
                        fase1 = false;
                    }
                    else if (fase2){
                        funcionalidades.entrarEmCombate(pikachu, inventario);
                        fase2 = false;
                    }

                }
                else if (opcao == 2){
                    inventario.curarPokemons();
                }
                else if (opcao == 3){
                    inventario.mostrarPokemons();
                }

            }
            

        }
    }
}

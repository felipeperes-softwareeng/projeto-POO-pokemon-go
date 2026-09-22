package com.pokemon.entity;

import funcionalidades.Funcionalidades;

public class Inventario {

    Funcionalidades funcionalidades = new Funcionalidades();
    private Pokemon[] pokemons;
    private int quantidade;

    public Inventario(){
        pokemons = new Pokemon[5];
        quantidade = 0;
    }

    public Pokemon escolherPokemonBatalha(){ //Tem a finalidade de escolher o pokemon que irá batalhar dentro do combate
        if(quantidade == 0){
            System.out.println("Você não tem nenhum pokemon. A batalha se encerra :(");
            System.out.println("Mas você pode tentar novamente após o descanço do(s) seu(s) pokemon(s)");
            return null;
        }

        Pokemon[] podeLutar = new Pokemon[quantidade];
        int quantidadeDisponivel = 0;

        System.out.println("Escolha o pokemon");
        for (Pokemon pokemon : pokemons){ //for-each para listar os pokemons
            if(pokemon != null && pokemon.getHp() > 0){

                podeLutar[quantidadeDisponivel] = pokemon;
                System.out.println(quantidadeDisponivel+1 + " - " + pokemon.getNome() + " | " + pokemon.getHp() + " HP");

                quantidadeDisponivel++;

            }

        }

        if (quantidadeDisponivel == 0){

            System.out.println("Todos os seus pokemons estão desmaiados.\n" +
                               "Mas você pode tentar novamente após o descanço do(s) seu(s) pokemon(s)");
            return null;

        }
        int opcao = funcionalidades.verificarOpcao(1, quantidadeDisponivel);

        return podeLutar[opcao - 1];
    }

    public boolean adicionarPokemon(Pokemon pokemon){
        if (quantidade >= pokemons.length){ //verifica se o inventario está cheio
            System.out.println("Seu inventário está cheio :(");
            return false;
        }
        pokemons[quantidade] = pokemon; //adiciona o pokemon na posição do inventario
        quantidade++;

        System.out.println(  //confirmação
                pokemon.getNome() + " foi adicionado ao seu inventário!"
        );
        return true;
    }

    public void mostrarPokemons() {

        if (quantidade == 0) {
            System.out.println("Seu inventário está vazio.");
            return;
        }

        System.out.println("===== SEU INVENTÁRIO =====");

        for (int i = 0; i < quantidade; i++) {
            System.out.println(
                    (i + 1) + " - " + pokemons[i].getNome()
            );
        }
    }

}

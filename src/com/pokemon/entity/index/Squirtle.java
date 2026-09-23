package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Squirtle herda os atributos da Classe Pokemon

public class Squirtle extends Pokemon {
    public Squirtle() {
        //Define os valores dos atributos da Classe Squirtle
        super("Squirtle", "Água", 1, 44, 25);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " afogou o " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
        switch (nivel) {

            case 1:
                setHp(44);
                setAtaqueBase(25);
                break;

            case 2:
                setHp(50);
                setAtaqueBase(30);
                break;

            case 3:
                System.out.println("Seu Squirtle evoluiu!");
                setHp(110);
                setAtaqueBase(45);
                break;

            case 4:
                setHp(120);
                setAtaqueBase(50);
                break;

            case 5:
                setHp(130);
                setAtaqueBase(55);
                break;
        }
    }
}

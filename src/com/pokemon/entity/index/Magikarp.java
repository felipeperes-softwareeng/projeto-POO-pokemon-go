package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Magikarp herda os atributos da Classe Pokemon


public class Magikarp extends Pokemon {
    public Magikarp() {
        //Define os valores dos atributos da Classe Magikarp
        super("Magikarp", "Água", 1, 45, 15);
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
                setHp(45);
                setAtaqueBase(15);
                break;

            case 2:
                setHp(50);
                setAtaqueBase(20);
                break;

            case 3:
                setHp(55);
                setAtaqueBase(25);
                break;

            case 4:
                setHp(60);
                setAtaqueBase(30);
                break;

            case 5:
                setHp(65);
                setAtaqueBase(35);
                break;
        }
    }
}


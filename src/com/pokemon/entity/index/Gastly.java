package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Gastly herda os atributos da Classe Pokemon

public class Gastly extends Pokemon {

    public Gastly() {
        //Define os valores dos atributos da Classe Gastly
        super("Gastly", "Fantasma", 1, 150, 50);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " lançou uma sombra no " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
        switch (nivel) {

            case 1:
                setHp(150);
                setAtaqueBase(50);
                break;

            case 2:
                setHp(155);
                setAtaqueBase(55);
                break;

            case 3:
                setHp(160);
                setAtaqueBase(60);
                break;

            case 4:
                setHp(165);
                setAtaqueBase(65);
                break;

            case 5:
                setHp(170);
                setAtaqueBase(70);
                break;
        }
    }
}
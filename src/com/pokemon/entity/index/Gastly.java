package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Gastly extends Pokemon {

    public Gastly() {
        super("Gastly", "Fantasma", 1, 70, 35);
    }

    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " lançou uma sombra no " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(70);
                setAtaqueBase(35);
                break;

            case 2:
                setHp(75);
                setAtaqueBase(40);
                break;

            case 3:
                setHp(80);
                setAtaqueBase(45);
                break;

            case 4:
                setHp(85);
                setAtaqueBase(50);
                break;

            case 5:
                setHp(90);
                setAtaqueBase(55);
                break;
        }
    }
}
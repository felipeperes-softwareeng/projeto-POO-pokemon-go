package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Gastly extends Pokemon {

    public Gastly() {
        super("Gastly", "Fantasma", 1, 150, 50);
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
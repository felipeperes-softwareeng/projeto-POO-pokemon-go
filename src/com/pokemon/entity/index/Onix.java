package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Onix extends Pokemon {

    public Onix() {
        super("Onix", "Pedra", 1, 250, 45);
    }

    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " acertou uma pedrada no " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(250);
                setAtaqueBase(45);
                break;

            case 2:
                setHp(260);
                setAtaqueBase(50);
                break;

            case 3:
                setHp(270);
                setAtaqueBase(55);
                break;

            case 4:
                setHp(280);
                setAtaqueBase(60);
                break;

            case 5:
                setHp(290);
                setAtaqueBase(65);
                break;
        }
    }
}
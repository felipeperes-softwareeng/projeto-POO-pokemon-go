package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Onix extends Pokemon {

    public Onix() {
        super("Onix", "Pedra", 1, 300, 60);
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
                setHp(300);
                setAtaqueBase(60);
                break;

            case 2:
                setHp(310);
                setAtaqueBase(65);
                break;

            case 3:
                setHp(320);
                setAtaqueBase(70);
                break;

            case 4:
                setHp(330);
                setAtaqueBase(75);
                break;

            case 5:
                setHp(340);
                setAtaqueBase(80);
                break;
        }
    }
}
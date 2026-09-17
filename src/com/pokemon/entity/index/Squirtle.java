package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", "Água", 1, 44, 48);
    }

    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " afogou o " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(44);
                setAtaqueBase(48);
                break;

            case 2:
                setHp(50);
                setAtaqueBase(54);
                break;

            case 3:
                setHp(55);
                setAtaqueBase(59);
                break;

            case 4:
                setHp(60);
                setAtaqueBase(64);
                break;

            case 5:
                setHp(65);
                setAtaqueBase(69);
                break;
        }
    }
}

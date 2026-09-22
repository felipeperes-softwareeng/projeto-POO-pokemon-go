package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Squirtle extends Pokemon {
    public Squirtle() {
        super("Squirtle", "Água", 1, 44, 25);
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
                setAtaqueBase(25);
                break;

            case 2:
                setHp(50);
                setAtaqueBase(30);
                break;

            case 3:
                setHp(55);
                setAtaqueBase(35);
                break;

            case 4:
                setHp(60);
                setAtaqueBase(40);
                break;

            case 5:
                setHp(65);
                setAtaqueBase(45);
                break;
        }
    }
}

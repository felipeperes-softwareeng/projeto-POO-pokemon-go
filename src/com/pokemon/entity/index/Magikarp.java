package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Magikarp extends Pokemon {
    public Magikarp() {
        super("Magikarp", "Água", 1, 45, 15);
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


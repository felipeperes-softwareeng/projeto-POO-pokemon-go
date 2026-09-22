package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Eevee extends Pokemon {

    public Eevee() {
        super("Eevee", "Normal", 1, 55, 55);
    }

    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " deu uma cabeçada no " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(55);
                setAtaqueBase(55);
                break;

            case 2:
                setHp(60);
                setAtaqueBase(60);
                break;

            case 3:
                setHp(65);
                setAtaqueBase(65);
                break;

            case 4:
                setHp(70);
                setAtaqueBase(70);
                break;

            case 5:
                setHp(75);
                setAtaqueBase(75);
                break;
        }
    }
}
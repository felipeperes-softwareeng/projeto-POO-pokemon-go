package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Eevee extends Pokemon {

    public Eevee() {
        super("Eevee", "Normal", 1, 105, 55);
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
                setHp(105);
                setAtaqueBase(55);
                break;

            case 2:
                setHp(110);
                setAtaqueBase(60);
                break;

            case 3:
                setHp(115);
                setAtaqueBase(65);
                break;

            case 4:
                setHp(120);
                setAtaqueBase(70);
                break;

            case 5:
                setHp(125);
                setAtaqueBase(75);
                break;
        }
    }
}
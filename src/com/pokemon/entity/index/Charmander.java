package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", "Fogo", 1, 39, 27);
    }

    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " lascou fogo no " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(39);
                setAtaqueBase(27);
                break;

            case 2:
                setHp(44);
                setAtaqueBase(32);
                break;

            case 3:
                System.out.println("Seu charmander evoluiu!");
                setHp(99);
                setAtaqueBase(60);
                break;

            case 4:
                setHp(104);
                setAtaqueBase(70);
                break;

            case 5:
                setHp(109);
                setAtaqueBase(80);
                break;
        }
    }
}

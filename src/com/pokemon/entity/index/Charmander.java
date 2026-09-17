package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Charmander extends Pokemon {
    public Charmander() {
        super("Charmander", "Fogo", 1, 39, 52);
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
                setAtaqueBase(52);
                break;

            case 2:
                setHp(44);
                setAtaqueBase(57);
                break;

            case 3:
                setHp(49);
                setAtaqueBase(62);
                break;

            case 4:
                setHp(54);
                setAtaqueBase(67);
                break;

            case 5:
                setHp(59);
                setAtaqueBase(72);
                break;
        }
    }
}

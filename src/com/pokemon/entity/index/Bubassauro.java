package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Bubassauro extends Pokemon {
    public Bubassauro() {
        super("Bulbassauro", "Planta", 1, 45, 49);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " tacou uma folha de bananeira no " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(45);
                setAtaqueBase(49);
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

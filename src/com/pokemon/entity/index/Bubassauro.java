package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Bubassauro extends Pokemon {
    public Bubassauro() {
        super("Bulbassauro", "Planta", 1, 45, 24);
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
                setAtaqueBase(24);
                break;

            case 2:
                setHp(50);
                setAtaqueBase(29);
                break;

            case 3:
                System.out.println("Seu bubassauro evoluiu!");
                setHp(105);
                setAtaqueBase(50);
                break;

            case 4:
                setHp(115);
                setAtaqueBase(60);
                break;

            case 5:
                setHp(125);
                setAtaqueBase(70);
                break;
        }
    }
}

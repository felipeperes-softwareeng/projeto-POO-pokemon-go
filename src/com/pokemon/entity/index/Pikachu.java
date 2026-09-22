package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

public class Pikachu extends Pokemon {
    public Pikachu() {
        super("Pikachu", "Elétrico", 1, 65, 25);
    }
    @Override
    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " eletrocutou o " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {

        switch (nivel) {

            case 1:
                setHp(65);
                setAtaqueBase(25);
                break;

            case 2:
                setHp(70);
                setAtaqueBase(30);
                break;

            case 3:
                setHp(75);
                setAtaqueBase(35);
                break;

            case 4:
                setHp(80);
                setAtaqueBase(40);
                break;

            case 5:
                setHp(85);
                setAtaqueBase(45);
                break;
        }
    }
}

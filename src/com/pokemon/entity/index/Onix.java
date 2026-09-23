package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Onix herda os atributos da Classe Pokemon

public class Onix extends Pokemon {

    public Onix() {
        //Define os valores dos atributos da Classe Onix
        super("Onix", "Pedra", 1, 300, 60);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " acertou uma pedrada no " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
        switch (nivel) {

            case 1:
                setHp(450);
                setAtaqueBase(60);
                break;

            case 2:
                setHp(450);
                setAtaqueBase(65);
                break;

            case 3:
                setHp(450);
                setAtaqueBase(70);
                break;

            case 4:
                setHp(450);
                setAtaqueBase(75);
                break;

            case 5:
                setHp(450);
                setAtaqueBase(80);
                break;
        }
    }
}
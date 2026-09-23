package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Eevee herda os atributos da Classe Pokemon

public class Eevee extends Pokemon {
    public Eevee() {
        //Define os valores dos atributos da Classe Eevee
        super("Eevee", "Normal", 1, 105, 55);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " deu uma cabeçada no " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
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
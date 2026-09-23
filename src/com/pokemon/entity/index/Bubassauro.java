package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Bubassauro herda os atributos da Classe Pokemon

public class Bubassauro extends Pokemon {
    public Bubassauro() {
        //Define os valores dos atributos da Classe Bubassauro
        super("Bulbassauro", "Planta", 1, 45, 24);
    }

    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " tacou uma folha de bananeira no " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
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

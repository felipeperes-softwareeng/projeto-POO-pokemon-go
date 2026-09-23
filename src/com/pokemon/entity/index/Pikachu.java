package com.pokemon.entity.index;

import com.pokemon.entity.Pokemon;

// Classe Pikachu herda os atributos da Classe Pokemon

public class Pikachu extends Pokemon {
    public Pikachu() {
        //Define os valores dos atributos da Classe Pikachu
        super("Pikachu", "Elétrico", 1, 65, 25);
    }
    @Override
    public void atacar(Pokemon inimigo){ //override personalizado de ataque para cada pokemon
        // Adquire o dano do ataque base
        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " eletrocutou o " + inimigo.getNome() + "!"
        );
        // Reduzir a vida do Pokemon Inimigo
        inimigo.receberDano(dano);

    }

    public void usarChoqueEspecial(Pokemon inimigo){

        double multiplicador = 1.5;

        System.out.println(
                getNome() + " usou Choque 220 volts em " + inimigo.getNome() + "!"
        );

        inimigo.receberDano(getAtaqueBase(), multiplicador);
    }

    @Override
    protected void atualizarAtributos() {
        // Vai ajustar a vida e o ataque do Pokemon de acordo com seu nivel
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

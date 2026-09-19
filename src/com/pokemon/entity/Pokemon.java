package com.pokemon.entity;

import funcionalidades.Funcionalidades;

public class Pokemon {

    Funcionalidades funcionalidades = new Funcionalidades();
    Inventario inventario = new Inventario();

    //Atibutos
    private String nome;
    private String tipo;
    protected int nivel;
    private int hp;
    private int ataqueBase;

    //Construtor
    public Pokemon(String nome, String tipo, int nivel, int hp, int ataqueBase){

        setNome(nome);
        setTipo(tipo);
        setNivel(nivel);
        setHp(hp);
        setAtaqueBase(ataqueBase);

    }

    public void receberDano(int dano){
        hp -= dano;

        if (hp < 0) {
            hp = 0;
        }

        System.out.println(
                getNome() + " recebeu " + dano + " de dano!"
        );

        System.out.println(
                "HP restante: " + hp
        );
    }

    public void atacar(Pokemon inimigo){

        int dano = getAtaqueBase();

        System.out.println(
                getNome() + " atacou " + inimigo.getNome() + "!"
        );
        inimigo.receberDano(dano);

    }




    public void mostrarPokemon(){
        System.out.println("""
                
                ╔══════════════════════════╗
                ║      INFORMAÇÕES         ║
                ╠══════════════════════════╣
                ║ Nome: %s
                ║ Tipo: %s
                ║ Nível: %d
                ║ HP: %d
                ║ Ataque Base: %d
                ╚══════════════════════════╝
                """.formatted(
                nome,
                tipo,
                nivel,
                hp,
                ataqueBase
        ));
    }

    public void subirNivel() {

        if (nivel < 5) {
            nivel++;

            System.out.println(
                    nome + " subiu para o nível " + nivel + "!"
            );

            atualizarAtributos();
        } else {
            System.out.println(
                    nome + " já está no nível máximo!"
            );
        }
    }

    protected void atualizarAtributos() {

    }


  //Getters e Setters
    //Setterr
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setNivel(int nivel) {

        if (nivel < 1) {
            this.nivel = 1;
        }

        else if (nivel > 5) {
            this.nivel = 5;
        }

        else {
            this.nivel = nivel;
        }
    }
    public void setHp(int hp) {

        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }

    public void setAtaqueBase(int ataqueBase){
        this.ataqueBase = ataqueBase;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public int getNivel() {
        return nivel;
    }
    public int getHp() {
        return hp;
    }
    public int getAtaqueBase() {
        return ataqueBase;
    }
}


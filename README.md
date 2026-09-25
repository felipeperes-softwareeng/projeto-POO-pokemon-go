# Projeto Pokémon - Programação Orientada a Objetos

Projeto acadêmico desenvolvido para o curso de Engenharia de Software com o objetivo de aplicar na prática conceitos de Programação Orientada a Objetos utilizando Java.

O sistema é inspirado no universo Pokémon e funciona através do console.

## Funcionalidades

- Escolha de Pokémon inicial
- Visualização das estatísticas dos Pokémon
- Sistema de inventário
- Batalhas por turnos
- Seleção de Pokémon para batalha
- Troca de Pokémon caso ele seja derrotado
- Recrutamento de Pokémon após uma vitória
- Sistema de níveis
- Recuperação dos Pokémon
- Exploração com diferentes fases
- Ataque especial do Pikachu
- Sistema de derrota e fim de jogo

## Conceitos de POO utilizados

O projeto utiliza conceitos estudados na disciplina de Programação Orientada a Objetos:

- Classes e objetos
- Encapsulamento
- Getters e setters
- Validação em setters
- Herança
- `extends`
- `super`
- Atributo `protected`
- Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Sobrecarga de métodos (Overload)
- Upcasting
- `instanceof`
- Downcasting
- Coleção polimórfica utilizando `Pokemon[]`

## Estrutura principal

A classe `Pokemon` funciona como superclasse do projeto.

As seguintes classes herdam de `Pokemon`:

- Bulbassauro
- Charmander
- Squirtle
- Magikarp
- Pikachu
- Eevee
- Gastly
- Onix

Cada Pokémon possui seus próprios atributos e comportamento de ataque através da sobrescrita do método `atacar()`.

## Sistema de batalha

Durante uma batalha, o jogador pode:

1. Atacar
2. Verificar as estatísticas do inimigo
3. Utilizar ataques especiais quando disponíveis
4. Fugir da batalha

Caso o Pokémon utilizado seja derrotado, o jogador pode selecionar outro Pokémon disponível no inventário.

Ao derrotar um inimigo, é possível escolher se ele será adicionado ao inventário.

## Tecnologias utilizadas

- Java
- IntelliJ IDEA
- Git
- GitHub

## Execução

O projeto pode ser executado através da classe:

```text
Main.java
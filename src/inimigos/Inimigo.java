package src.inimigos;

import src.personagens.Personagem;

public class Inimigo extends Personagem {
    
    public Inimigo (String nome, int dano, int vida, int defesa, int especial) {
        super(nome, dano, vida, defesa, especial);
    }
}
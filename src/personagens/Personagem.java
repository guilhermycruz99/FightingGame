package src.personagens;

public class Personagem {
    
    String nome;
    int dano;
    int vida;
    int defesa;
    int especial;

    public Personagem (String nome,int dano, int vida, int defesa, int especial) {
        this.nome = nome;
        this.dano = dano;
        this.vida = vida;
        this.defesa = defesa;
        this.especial = especial;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Dano: " + dano);
        System.out.println("Vida: " + vida);        
        System.out.println("Defesa: " + defesa);   
        System.out.println("Especial: " + especial);
    }
}
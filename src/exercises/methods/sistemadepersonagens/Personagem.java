package exercises.methods.sistemadepersonagens;

public class Personagem {
    public String nome;
    public int vida;

    public void atacarPersonagem(Personagem alvo){
            System.out.println(this.nome+" atacou "+alvo.nome+"!");
    }

    public void receberDano(int dano){
        if(dano < this.vida){
            this.vida -= dano;
            System.out.println("O personagem "+this.nome+" sofreu "+dano+" de dano.");
            System.out.println("Vida atual: "+this.vida);
            System.out.println();
        }else{
            this.vida = 0;
            System.out.println("O personagem "+this.nome+" foi morto!");
            System.out.println("Vida atual: "+this.vida);
            System.out.println();
        }

    }

    public void curarPersonagem(int cura){
        if(this.vida == 0){
            this.vida += cura;
            System.out.println("O personagem "+this.nome+" foi curado e está de volta ao jogo!");
            System.out.println("Vida atual após a cura: "+this.vida);
            System.out.println();
        }else{
            this.vida += cura;
            System.out.println("O personagem "+this.nome+" foi curado!");
            System.out.println("Vida atual após a cura: "+this.vida);
            System.out.println();
        }
    }

    public void exibirStatus(){
        System.out.println("-=-=-=-=-=-=Status " +this.nome+"=-=-=-=-=-=-");
        System.out.println("HP atual: "+ this.vida);
        System.out.println();
    }
}

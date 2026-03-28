package exercises.methods.controledeestoque;

public class Produto {
    public String nome;
    public int quantidade;


    public void adicionarEstoque(int qtd){
        if(qtd>0){
            System.out.println("Adicionando estoque:");
            System.out.println("Serão adicionado mais "+qtd+" no estoque!");
            this.quantidade += qtd;
            System.out.println("O novo estoque de "+this.nome+" é: "+this.quantidade);
            System.out.println();
        }else {
            System.out.println("Quantidade invalida.");
        }
    }

    public void removerEstoque(int qtd){
        if(this.quantidade >= qtd){
            System.out.println("Removendo estoque: ");
            this.quantidade -= qtd;
            System.out.println("O novo estoque de "+this.nome+" é: "+this.quantidade);
            System.out.println();
        }
        else{
            System.out.println("Não possui estoque suficiente para esse produto.");
            System.out.println("Estoque atual: "+this.quantidade);
        }
    }

    public void exibirEstoque(){
        System.out.println("Estoque de "+this.nome+": "+this.quantidade);
    }
}
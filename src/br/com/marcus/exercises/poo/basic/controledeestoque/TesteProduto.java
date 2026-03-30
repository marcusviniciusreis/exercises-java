package br.com.marcus.exercises.poo.basic.controledeestoque;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();

        p1.nome = "Placa de video";
        p1.quantidade = 3;
        p2.nome = "Processador";
        p2.quantidade = 6;
        p3.nome = "SSD";
        p3.quantidade = 10;

        p1.adicionarEstoque(10);
        p2.adicionarEstoque(4);
        p3.adicionarEstoque(1);

        p1.removerEstoque(3);
        p2.removerEstoque(2);
        p3.removerEstoque(5);

        p1.exibirEstoque();
        p2.exibirEstoque();
        p3.exibirEstoque();
    }
}

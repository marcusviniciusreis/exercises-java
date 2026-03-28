package exercises.methods.sistemadepedidos;

public class TestePedido {
    public static void main(String[] args) {
        Pedido cliente1 = new Pedido();
        Pedido cliente2 = new Pedido();

        cliente1.nome = "Susan Ramos Lima";
        cliente1.valorTotal = 200;

        cliente2.nome = "Marcus Vinicius";
        cliente2.valorTotal = 20;


        cliente1.adicionarItem(30);
        cliente1.aplicarDescontos(10);

        cliente2.adicionarItem(200);
        cliente2.aplicarDescontos(15);

        cliente1.exibirResumo();
        cliente2.exibirResumo();
    }
}

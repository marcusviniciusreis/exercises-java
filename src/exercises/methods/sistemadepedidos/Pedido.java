package exercises.methods.sistemadepedidos;

public class Pedido {
    public String nome;
    public double valorTotal;


    public void adicionarItem(double valor){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(this.nome+" acaba de adicionar um produto no valor de: "+valor);
        this.valorTotal += valor;
    }

    public void aplicarDescontos(double desconto){
        if (desconto<100) {
            double valorDescontado = (this.valorTotal * (desconto / 100));
            this.valorTotal -= valorDescontado;
             }else {
            System.out.println("Não é permitido desconto maior que 100%.");
        }
    }

    public void exibirResumo(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Cliente:"+nome);
        System.out.println("Valor total do pedido: "+valorTotal);
    }

}


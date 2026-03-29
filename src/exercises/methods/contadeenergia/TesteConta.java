package exercises.methods.contadeenergia;

public class TesteConta {
    public static void main(String[] args) {
        ContaEnergia[] contas = new ContaEnergia[3];

        contas[0] = new ContaEnergia();
        contas[1] = new ContaEnergia();
        contas[2] = new ContaEnergia();

        contas[0].consumo = 80;
        contas[1].consumo = 120;
        contas[2].consumo = 180;

        for (int i = 0; i < 3; i++) {
            if(contas[i].consumo >= 100){
                System.out.println("-=-=-=-=-=-=-=Conta "+i+" -=-=-=-=-=-=-=");
                System.out.println("O valor da sua conta de energia foi: "+contas[i].calcularConta());
                System.out.println("Como você teve um consumo igual ou maior que 100Kwh, voce terá uma tarifa. Valor da tarifa: "+contas[i].aplicarTarifa());
                System.out.println("Valor final: "+contas[i].exibirContaFinal(contas[i].aplicarTarifa()));
                System.out.println();
            }
            else{
                System.out.println("-=-=-=-=-=-=-=Conta "+i+" -=-=-=-=-=-=-=");
                System.out.println("O valor da sua conta de energia foi: "+contas[i].calcularConta());
                System.out.println("Valor final: "+contas[i].calcularConta());
                System.out.println();
            }
        }
    }
}

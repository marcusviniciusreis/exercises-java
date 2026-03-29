package exercises.methods.contadeenergia;

public class ContaEnergia {
    public double consumo;
    public double valorPorKwh = 0.5;


    public double calcularConta(){
        this.consumo *= valorPorKwh;
        return  this.consumo;
    }
    public double aplicarTarifa(){
        double tarifa = 0.10;
        tarifa *= this.consumo;
        return tarifa;

    }
    public double exibirContaFinal(double valorFinal){
        valorFinal += this.consumo;
        return valorFinal;
    }

}

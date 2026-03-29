package exercises.methods.sistemadenotas;

public class Aluno {
    public String nome;
    public double[] notas;

    public void adicionarNotas(double nota, int posicao){
        if(nota>=0 && nota <=10 && posicao >= 0 && posicao <= notas.length){
            notas[posicao] = nota;
        }
        else{
            System.out.println("Nota ou posição invalidas!");
        }
    }
    public double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma/notas.length;
    }
    public void verificarAprovacao(){
        double media = calcularMedia();
        if (media>=7){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
    public void exibirBoletim() {
        System.out.println("Nome: " + nome);

        System.out.print("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }

        double media = calcularMedia();
        System.out.println("\nMédia: " + media);

        verificarAprovacao();
        System.out.println();
    }
}

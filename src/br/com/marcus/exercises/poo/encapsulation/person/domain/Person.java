package br.com.marcus.exercises.poo.encapsulation.person.domain;

public class Person {
    private String nome;
    private int idade;
    private String cidade;

    public void imprime(){
        System.out.println("-----------");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("Cidade: "+getCidade());

    }

    public Person(String nome, int idade, String cidade) {
        setNome(nome);
        setIdade(idade);
        setCidade(cidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            System.out.println("ATENÇÃO! Idade invalida para "+getNome());
        }else {
            this.idade = idade;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}

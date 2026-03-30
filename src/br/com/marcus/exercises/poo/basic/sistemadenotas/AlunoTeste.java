package br.com.marcus.exercises.poo.basic.sistemadenotas;

public class AlunoTeste {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[2];

        alunos[0] = new Aluno();
        alunos[1] = new Aluno();

        alunos[0].nome = "Saitama";
        alunos[0].notas = new double[3];

        alunos[1].nome = "Hashirama";
        alunos[1].notas = new double[3];

        alunos[0].adicionarNotas(7, 0);
        alunos[0].adicionarNotas(2, 1);
        alunos[0].adicionarNotas(6, 2);

        alunos[1].adicionarNotas(5, 0);
        alunos[1].adicionarNotas(6, 1);
        alunos[1].adicionarNotas(4, 2);

        for (int i = 0; i < alunos.length; i++) {
            alunos[i].exibirBoletim();
        }
    }
}

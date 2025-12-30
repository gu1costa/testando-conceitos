package br.com.detran.praticandoconceitos.nivel3_1;

public class TesteAluno {
    public static void main(String[] args) {

        //1. criando a entidade do model.
        Aluno aluno1 = new Aluno(1, "Guilherme", 0, 0);
        Aluno aluno2 = new Aluno(2, "Eduardo", 0, 0);

        //2. criando o controller.
        AlunoController controller = new AlunoController();

        //3. simulação das requisições do usuário.
        //aluno1
        controller.adicionarNotas(aluno1, 7.5, 8);
        controller.verificarAprovacao(aluno1);

        //aluno2
        controller.adicionarNotas(aluno2, 4, 6.5);
        controller.verificarAprovacao(aluno2);

        System.out.println("Média final de " + aluno1.getNome() + ":" + aluno1.calcularMedia());
        System.out.println("Média final de " + aluno2.getNome() + ":" + aluno2.calcularMedia());
    }
}

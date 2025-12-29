package br.com.detran.praticandoconceitos.nivel3_1;

public class AlunoService {
    public void adicionarNotas(Aluno aluno, double nota1, double nota2){
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        System.out.println("Notas adicionadas para " + aluno.getNome());
    }

    public boolean estaAprovado(Aluno aluno){
        double media = aluno.calcularMedia();
        return media >= 6;
    }
}

package br.com.detran.praticandoconceitos.nivel3_1;

public class AlunoService {
    public void adicionarNotas(Aluno aluno, double n1, double n2){  //"Aluno aluno" funciona como ponte temporária para Aluno (model)
        aluno.setNota1(n1);
        aluno.setNota2(n2);
    }

    public boolean estaAprovado(Aluno aluno){ //"ponte" temporária atuando da mesma forma.
        if(aluno.calcularMedia() >= 7){
            return true;
        } else {
            return false;
        }
    }
}

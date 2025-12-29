package br.com.detran.praticandoconceitos.nivel3_1;

public class Aluno {

    private int id;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(){}

    public Aluno(int id, String nome, double nota1, double nota2){
        this.id = id;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(double nota1, double nota2){
        return (nota1 + nota2) / 2;
    }
}

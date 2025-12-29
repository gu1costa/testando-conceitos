package br.com.detran.praticandoconceitos.nivel3;

public class ClienteMVC {

    //atributos.
    private int id;
    private String nome;
    private double saldo;

    //construtor vazio.
    public ClienteMVC(){}

    //construtor cheio.
    public ClienteMVC(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    //getter's e setter's.
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos que alteram o estado do objeto.
    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }
}

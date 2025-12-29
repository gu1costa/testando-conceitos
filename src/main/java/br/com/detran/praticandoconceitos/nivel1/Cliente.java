package br.com.detran.praticandoconceitos.nivel1;

public class Cliente {
    private int id;
    private String nome;
    private double saldo;

    public Cliente(){}

    public Cliente(int id, String nome, double saldo) {
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    //getters e setters
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //metodo depositar
    public void depositar(double valor){
        saldo += valor;
    }

    //metodo sacar
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        }
    }
}

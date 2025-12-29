package br.com.detran.praticandoconceitos.nivel2;

public class Pedido {

    private int numero;
    private Produto produto;
    private int quantidade;

    public Pedido(){}

    public Pedido(int numero, Produto produto, int quantidade) {
        this.numero = numero;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularTotal(){
        double total;
        total = produto.getPreco() * quantidade;
        return total;
    }
}

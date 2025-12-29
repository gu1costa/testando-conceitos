package br.com.detran.praticandoconceitos.nivel2;

public class TestePedido {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setId(1);
        produto.setNome("Teclado");
        produto.setPreco(200);

        Pedido pedido = new Pedido();
        pedido.setNumero(1);
        pedido.setProduto(produto);
        pedido.setQuantidade(2);

        System.out.println("=======================");
        System.out.println("| Produto: " + produto.getNome() + "    |");
        System.out.println("| Quantidade: " + pedido.getQuantidade() + "       |");
        System.out.println("| Valor total: R$" + pedido.calcularTotal() + "|");
        System.out.println("=======================");
    }
}

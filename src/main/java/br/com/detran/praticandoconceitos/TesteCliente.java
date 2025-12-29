package br.com.detran.praticandoconceitos;

public class TesteCliente {
    public static void main(String[] args){

        //utilizando construtor vazio
        Cliente cliente_1 = new Cliente();
        cliente_1.setId(1);
        cliente_1.setNome("Guilherme");
        cliente_1.setSaldo(2500);

        //utilizando construtor cheio
        Cliente cliente_2 = new Cliente(2, "Eduardo", 200);

        //chamando os métodos que mudam o estado do objeto.
        cliente_1.depositar(500);
        cliente_2.depositar(100);

        cliente_1.sacar(250);
        cliente_2.sacar(20);

        System.out.println("Saldo de " + cliente_1.getNome() + ":" + cliente_1.getSaldo());
        System.out.println("Saldo de " + cliente_2.getNome() + ":" + cliente_2.getSaldo());
    }
}

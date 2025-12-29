package br.com.detran.praticandoconceitos.nivel3;

    //Classe destinada para a regra de negócios.

public class ClienteService {
    public void adicionarSaldo(ClienteMVC cliente, double valor){
        if(valor > 0){
            cliente.depositar(valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public boolean retirarSaldo(ClienteMVC cliente, double valor){
        if(valor > 0 && valor <= cliente.getSaldo()){
            cliente.sacar(valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso para " + cliente.getNome() + "!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false;
        }
    }
}

package br.com.detran.praticandoconceitos.nivel3;

public class ClienteController {

    //ponte para acessar os métodos de ClienteService - uma referência para o ClienteService
    private ClienteService service;

    //Criando o objeto Controller para realizar as operações com os métodos de ClienteService
    public ClienteController() {
        this.service = new ClienteService();
    }

    //método que simula um depósito
    public void realizarDeposito(ClienteMVC cliente, double valor){
        service.adicionarSaldo(cliente, valor);
    }

    //método que simula um saque
    public void realizarSaque(ClienteMVC cliente, double valor){
        boolean sucesso = service.retirarSaldo(cliente, valor);
        if(!sucesso){
            System.out.println("O saque não foi realizado");
        }
    }
}

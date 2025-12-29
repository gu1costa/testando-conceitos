package br.com.detran.praticandoconceitos.nivel3;

public class TesteClienteMVC {
    public static void main(String[] args) {

        //Criando objeto do Model
        ClienteMVC clienteGuilherme = new ClienteMVC();
        ClienteMVC clienteEduardo = new ClienteMVC();
        clienteGuilherme.setNome("Guilherme");
        clienteEduardo.setNome("Eduardo");

        //Criando objeto do controller para acessar ClienteController
        ClienteController controller = new ClienteController();

        //Chamando os métodos do Controller que usam o service
        controller.realizarDeposito(clienteGuilherme, 2500);
        controller.realizarDeposito(clienteEduardo, 200);

        controller.realizarSaque(clienteGuilherme, 500);
        controller.realizarSaque(clienteEduardo, 205);

        //Exibindo os resultados
        // Exibindo saldo final
        System.out.println("=========================");
        System.out.println(clienteGuilherme.getNome() + " - Saldo: R$" + clienteGuilherme.getSaldo());
        System.out.println(clienteEduardo.getNome() + " - Saldo: R$" + clienteEduardo.getSaldo());
        System.out.println("=========================");
    }
}

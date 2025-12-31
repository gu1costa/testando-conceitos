package br.com.detran.praticandoconceitos.nivel3_1;

public class AlunoController {

    //define quais métodos são acessados pelo controller, então como são do tipo AlunoService, são permitidos o adicionarNota e estaAprovado.
    private  AlunoService service;

    //criando instância de objeto para utilizar os métodos do Service.

    /*
    Declaramos a variável service para poder acessar os métodos da classe AlunoService,
    e no construtor AlunoController() nós criamos o objeto real que permitirá a utilização efetiva desses métodos.
     */

    //"injeção manual de dependências" (!!!).
    public AlunoController(){
        this.service = new AlunoService();
    }

    //simulação de requisições
    public void adicionarNotas(Aluno aluno, double n1, double n2){
        service.adicionarNotas(aluno, n1, n2);
        System.out.println("Notas de " + aluno.getNome() + " adicionadas com sucesso.");
    }

    public void verificarAprovacao(Aluno aluno){
        if(service.estaAprovado(aluno)){
            System.out.println("Aluno aprovado com sucesso.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}

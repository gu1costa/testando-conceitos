package br.com.detran.praticandoconceitos.nivel3_2;

public class BibliotecaController {

    private BibliotecaService service;

    public BibliotecaController(){
        this.service = new BibliotecaService();
    }

    public void emprestarLivro(Livro livro){
        if(service.emprestarLivro(livro)){
            System.out.println("Livro " + livro.getTitulo() + " emprestado com sucesso.");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " indisponível para empréstimo.");
        }
    }

    public void devolverLivro(Livro livro){
        if(service.devolverLivro(livro)){
            System.out.println("Livro " + livro.getTitulo() + " devolvido com sucesso.");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " não estava emprestado.");
        }
    }

    public void verificarDisponibilidade(Livro livro){
        if(service.verificarDisponibilidade(livro)){
            System.out.println("Livro " + livro.getTitulo() + " está disponível.");
        } else {
            System.out.println("Livro " + livro.getTitulo() + " está indisponível.");
        }
    }
}

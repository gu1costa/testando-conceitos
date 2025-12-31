package br.com.detran.praticandoconceitos.nivel3_2;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Livro livro1 = new Livro(1, "Watchmen", "Alan Moore", false);
        Livro livro2 = new Livro(2, "Sandman", "Neil Gaimann", true);

        BibliotecaController controller = new BibliotecaController();

        controller.emprestarLivro(livro1);
        controller.emprestarLivro(livro2);

        controller.emprestarLivro(livro1);
        controller.devolverLivro(livro2);

        controller.devolverLivro(livro1);

    }
}

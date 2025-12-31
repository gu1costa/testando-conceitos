package br.com.detran.praticandoconceitos.nivel3_2;

public class BibliotecaService {
    public boolean emprestarLivro(Livro livro){
        if(livro.isDisponivel()){
            livro.emprestar();
            return true;
        } else {
            return false;
        }
    }

    public boolean devolverLivro(Livro livro){
        if(!livro.isDisponivel()){
            livro.devolver();
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarDisponibilidade(Livro livro){
        return livro.isDisponivel();
    }
}

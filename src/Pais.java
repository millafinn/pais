public class Pais {
    private String nome;
    private int população;

    Pais (String nome, int população){
        this.nome=nome;
        this.população=população;
    }

    void setNome(String nome){
        this.nome=nome;
    }

    String getNome(){
        return(nome);
    }

    void setPopulação(int população){
        this.população=população;
    }

    int getPopulação(){
        return(população);
    }
}

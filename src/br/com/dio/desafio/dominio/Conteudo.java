package br.com.dio.desafio.dominio;

public abstract class Conteudo {



// o intuito de criar essa classe é para iniciar os atributos
// titulo , atributos e descrição e criar um metodo para calcular
//o XP. PARA QUE AS CLASSES FINHAS  UTILIZEM DAI ESSES ATRIBUTOS
// E METODOS. PARA QUE ISSO? isso é para poder simplificar o nosso código
//e evitar repetição.

    protected static final double XP_PADRAO= 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

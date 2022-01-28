package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    //criando um construtor vazio

    public Curso() {
    }


    // PARA PODEMOS  TRABALHAR COM OS ATRIBUTOS ACIMA NECESSITAMOS CRIAR O MÉTODO
    //  GET E SET

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Criar um ToString para poder imprimir e verificar se tudo ficou correto;
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}

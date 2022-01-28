package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    //criando um construtor vazio

    public Curso() {
    }
//************************************************************************************************
    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }

//************************************************************************************************
    // PARA PODEMOS  TRABALHAR COM OS ATRIBUTOS ACIMA NECESSITAMOS CRIAR O MÉTODO GET E SET.


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
//************************************************************************************************
    // Criar um ToString para poder imprimir e verificar se tudo ficou correto;
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';

//************************************************************************************************
    }


}

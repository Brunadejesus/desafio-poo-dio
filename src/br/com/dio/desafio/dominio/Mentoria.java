package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    /* Para que eu possa dizer que metória e filha de conteudo eu utilizo o a palavra reservada extends, e isso que dizer quê?
    *  A classe mentoria se extende da classe conteudo,  ou seja, a clsse metoria e filha da classe conteudo. porem deve se
    * lembrado que tudo que eu tiver na classe conteudo eu terei em mentoria ,mas
    * nem tudo que tenho em metoria terei na classe conteudo.  * */

    private String titulo;
    private String descricao;

    private LocalDate data;
//************************************************************************************************
    //criando um construtor vazio

    public Mentoria() {
    }

//************************************************************************************************
    // PARA PODEMOS  TRABALHAR COM OS ATRIBUTOS ACIMA NECESSITAMOS CRIAR O MÉTODO
    //  GET E SET

    @Override
    public double calcularXp() {//metodo Calcular XP
        return XP_PADRAO+20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

 //************************************************************************************************

        // Criar um ToString para poder imprimir e verificar se tudo ficou correto.

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }


}

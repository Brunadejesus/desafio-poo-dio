import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1=new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java ");
        curso1.setCargaHoraria(8);

        Curso curso2=new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript ");
        curso2.setCargaHoraria(4);

       // Conteudo conteudo=new Curso();




        Mentoria mentoria1=new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição do Curso Java ");
        mentoria1.setData(LocalDate.now());

        /*
        Mentoria mentoria2=new Mentoria();
        mentoria2.setTitulo("Mentoria JavaScript");
        mentoria2.setDescricao("Descrição do Curso JavaScript ");
        mentoria2.setData(LocalDate.now());

       *****************************************************************
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1); */


        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        System.out.println("\n-______________________________________________________________________________________\n-");
        Dev devBruna=new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna:"+devBruna.getConteudosInscritos());
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruna:"+devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruna:"+devBruna.getConteudosConcluidos());
        System.out.println("XP="+devBruna.calcularXp());


        System.out.println("\n\n********************************************************************************************\n\n");
        Dev devFlavio=new Dev();
        devFlavio.setNome("Flavio");
        devFlavio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Flávio:"+devFlavio.getConteudosInscritos());
        devFlavio.progredir();
        devFlavio.progredir();
        devFlavio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Flávio:"+devFlavio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Flávio:"+devFlavio.getConteudosConcluidos());
        System.out.println("XP="+devFlavio.calcularXp());



    }
}

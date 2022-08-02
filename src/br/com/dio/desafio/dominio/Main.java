package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Desccrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeticia = new Dev();
        devLeticia.setNome("Leticia");
        devLeticia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leticia: " + devLeticia.getConteudosInscritos());

        devLeticia.progredir();
        devLeticia.progredir();
        devLeticia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Incritos Leticia: " + devLeticia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leticia: " + devLeticia.getConteudoConcluidos());
        System.out.println("XP: " + devLeticia.calcularTotalXp());
        System.out.println("------------");

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());

        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus: " + devMatheus.getConteudoConcluidos());
        System.out.println("XP: " + devMatheus.calcularTotalXp());
    }
}

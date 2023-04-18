import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

//        Curso curso1 = new Curso();
//        curso1.setTitulo("Curso Java");
//        curso1.setDescricao("Descrição Curso Java");
//        curso1.setCargaHoraria(8);
//
//        Curso curso2 = new Curso();
//        curso2.setTitulo("Curso JavaScript");
//        curso2.setDescricao("Descrição Curso JavaScript");
//        curso2.setCargaHoraria(4);
//
//        System.out.println(curso1);
//        System.out.println(curso2);
//
//        Mentoria mentoria1 = new Mentoria();
//        mentoria1.setTitulo("Mentoria Java");
//        mentoria1.setDescricao("Descrição Mentoria Java");
//        mentoria1.setData(LocalDate.now());
//
//        System.out.println(mentoria1);

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição Curso Java");
        cursoJava.setCargaHoraria(8);

        System.out.println(cursoJava);

        Curso cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("Curso JavaScript");
        cursoJavaScript.setDescricao("Descrição Curso JavaScript");
        cursoJavaScript.setCargaHoraria(4);

        System.out.println(cursoJavaScript);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria Java");
        mentoriaJava.setDescricao("Descrição Mentoria Java");
        mentoriaJava.setData(LocalDate.now());

        System.out.println(mentoriaJava);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoJavaScript);
        bootcampJava.getConteudos().add(mentoriaJava);

        System.out.println(bootcampJava);

        System.out.println("-----###-----");

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");

        System.out.println(devLuis);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");

        System.out.println(devCamila);

        System.out.println("-----###-----");

        // Luis
        devLuis.inscreverBootcamp(bootcampJava);
        System.out.printf("Conteúdos Inscritos (%s): %s%n"
                ,devLuis.getNome()
                ,devLuis.getConteudoInscritos());
        System.out.printf("Conteúdos Concluídos (%s): %s%n"
                ,devLuis.getNome()
                ,devLuis.getConteudoConcluidos());
        devLuis.progredir();
        System.out.println("-#-");
        System.out.printf("Conteúdos Inscritos (%s): %s%n"
                ,devLuis.getNome()
                ,devLuis.getConteudoInscritos());
        System.out.printf("Conteúdos Concluídos (%s): %s%n"
                ,devLuis.getNome()
                ,devLuis.getConteudoConcluidos());
        System.out.printf("XP (%s): %s%n"
                ,devLuis.getNome()
                ,devLuis.calcularTotalXp());

        System.out.println("-----###-----");

        // Camila
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.printf("Conteúdos Inscritos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoInscritos());
        System.out.printf("Conteúdos Concluídos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoConcluidos());
        devCamila.progredir();
        System.out.println("-#-");
        System.out.printf("Conteúdos Inscritos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoInscritos());
        System.out.printf("Conteúdos Concluídos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoConcluidos());
        devCamila.progredir();
        System.out.println("-#-");
        System.out.printf("Conteúdos Inscritos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoInscritos());
        System.out.printf("Conteúdos Concluídos (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.getConteudoConcluidos());
        System.out.printf("XP (%s): %s%n"
                ,devCamila.getNome()
                ,devCamila.calcularTotalXp());

    }
}
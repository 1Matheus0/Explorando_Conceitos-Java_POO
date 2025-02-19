import domino.Bootcamp;
import domino.Curso;
import domino.Dev;
import domino.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Instanciando curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Java basico ao Avancado");
        curso1.setDescricao("Aprenda a linguagem e programacaa Java do basico ao avancado");
        curso1.setCargoHoraria(70);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java com Spring");
        curso2.setDescricao("Aprenda a ultilizar Java com Framewoork Spring");
        curso2.setCargoHoraria(40);


        //Instanciando mentorira
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Mentoria para a linguagem de programacao Java");
        mentoria.setData(LocalDate.now());

        //Instanciando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Seja um Desenvolvedor com Java");
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);


        //Instanciando dev

        Dev devClaudio = new Dev();
        devClaudio.setNome("Claudio");
        devClaudio.increverBootcamp(bootcamp);
        System.out.println("Contudos Inscritos para Claudio: "+devClaudio.getConteudosIscritos());

        devClaudio.progredir();
        System.out.println("Conteúdos inscritos para claudio, após o primeiro progresso : " + devClaudio.getConteudosIscritos());

        devClaudio.progredir();
        System.out.println("_______________");
        System.out.println("Conteudos incritos para Claudio: "+devClaudio.getConteudosIscritos());
        System.out.println("Conteudos concluidos para Claudio: "+devClaudio.getConteudosConcluidos());

        System.out.println("Xp: "+devClaudio.calcularXp());

        System.out.println("---------------------------------------------------------------");

        Dev devJose = new Dev();

        devJose.setNome("Jose");
        devJose.increverBootcamp(bootcamp);
        System.out.println("Contudos Inscritos para Jose: "+devJose.getConteudosIscritos());

        devJose.progredir();
        System.out.println("Conteúdos inscritos para claudio, após o primeiro progresso : " + devJose.getConteudosIscritos());

        devJose.progredir();
        System.out.println("_______________");
        System.out.println("Conteudos incritos para Jose: "+devJose.getConteudosIscritos());
        System.out.println("Conteudos concluidos para Jose: "+devJose.getConteudosConcluidos());

        System.out.println("Xp: "+devJose.calcularXp());

    }
}
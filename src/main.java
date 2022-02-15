import br.com.dio.desafio.Contents;
import br.com.dio.desafio.Courses;
import br.com.dio.desafio.Mentorship;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Courses course = new Courses();
        Mentorship mentorship = new Mentorship();
        List<Contents> cursos = new ArrayList<>();
        List<Contents> mentorias = new ArrayList<>();
        int continuar = 1;
        int escolha;

        while (continuar == 1) {

            escolha = Integer.parseInt(JOptionPane.showInputDialog("Digita a opção desejada:\n"));

            switch(escolha){
                case 1:
                    cursos.add(course.novoCurso());
                case 2:
                    for (Contents conteudo : cursos){
                        System.out.println(conteudo);}
                case 3:
                    mentorias.add(mentorship.novaMentoria());
                case 4:
                    for(Contents conteudo : mentorias){
                    System.out.println(conteudo);}
                case 5:

            }

                continuar = Integer.parseInt(JOptionPane.showInputDialog("Adicionar novo curso?\n1- Sim\n2- Nao\n"));}

        System.out.println(cursos.toString());

        }
    }


import br.com.dio.desafio.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Courses course = new Courses();
        Mentorship mentorship = new Mentorship();
        List<Contents> cursos = new ArrayList<>();
        List<Contents> mentorias = new ArrayList<>();
        Resources recursos = new Resources();
        int continuar = 1;
        int escolha;

        while (continuar == 1) {

            recursos.menu();
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Digita a opção desejada:\n"));

            switch (escolha) {
                case 1:
                    cursos.add(course.novoCurso());
                    break;
                case 2:
                    for (Contents conteudo : cursos) {
                        System.out.println(conteudo);
                    }
                    break;
                case 3:
                    mentorias.add(mentorship.novaMentoria());
                    break;
                case 4:
                    for (Contents conteudo : mentorias) {
                        System.out.println(conteudo);
                    }
                    break;
                case 5:
                    System.out.println("Programa encerrado.\n");
                    continuar = 2;
                    break;
                default:
                    System.err.println("Opção inválida.\n");
                    break;
            }
        }

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp de 100h sobre Java");
        bootcamp1.getContents().addAll(cursos);
        bootcamp1.getContents().addAll(mentorias);

        Dev devLuis = new Dev();
        devLuis.setNome("Luis");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");

        System.out.println("Conteudos inscritos Luis:\n" + devLuis.getCursosIncritos());
        devLuis.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Luis:\n" + devLuis.getCursosIncritos());
        System.out.println("Conteudos concluidos Luis:\n" + devLuis.getCursoConcluidos());

        System.out.println("Conteudos inscritos Carlos:\n" + devCarlos.getCursosIncritos());
        devCarlos.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Luis:\n" + devCarlos.getCursosIncritos());
        System.out.println("Conteudos concluidos Luis:\n" + devCarlos.getCursoConcluidos());
        devCarlos.progredir();
        System.out.println("Conteudos concluidos Luis:\n" + devCarlos.getCursoConcluidos());


        }
    }


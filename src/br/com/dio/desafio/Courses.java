package br.com.dio.desafio;

import javax.swing.*;

public class Courses extends Contents{

    @Override
    public String toString() {
        return "Courses{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    }

    public Contents novoCurso(){
        Contents content = new Courses();
        content.setTitulo(JOptionPane.showInputDialog("Digite o título do curso: "));
        content.setDescricao(JOptionPane.showInputDialog("Digite a descrição do curso: "));
        content.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Digite a carga horária do curso: ")));
        return content;
    }
}

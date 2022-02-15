package br.com.dio.desafio;

import javax.swing.*;
import java.time.LocalDate;

public class Mentorship extends Contents{

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return 0;
    }

    public Contents novaMentoria(){
        Contents content = new Mentorship();
        content.setTitulo(JOptionPane.showInputDialog("Digite o título do curso: "));
        content.setDescricao(JOptionPane.showInputDialog("Digite a descrição do curso: "));
        content.getData();
        return content;
    }
}

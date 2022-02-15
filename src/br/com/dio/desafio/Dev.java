package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Contents> cursosIncritos = new LinkedHashSet<>();
    private Set<Contents> cursoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.cursosIncritos.addAll(bootcamp.getContents());
        bootcamp.getDev().add(this);
    }

    public void progredir(){
        Optional<Contents> conteudo = this.cursosIncritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.cursoConcluidos.add(conteudo.get());
            this.cursosIncritos.remove(conteudo.get());}
        else{
            System.err.println("Voce não esta matriculado em nenhum bootcamp.\n");}
    }

    public double calcularTotalXp(){
        return this.cursoConcluidos.stream().mapToDouble(Contents::calcularXP).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Contents> getCursosIncritos() {
        return cursosIncritos;
    }

    public void setCursosIncritos(Set<Contents> cursosIncritos) {
        this.cursosIncritos = cursosIncritos;
    }

    public Set<Contents> getCursoConcluidos() {
        return cursoConcluidos;
    }

    public void setCursoConcluidos(Set<Contents> cursoConcluidos) {
        this.cursoConcluidos = cursoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(cursosIncritos, dev.cursosIncritos) && Objects.equals(cursoConcluidos, dev.cursoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cursosIncritos, cursoConcluidos);
    }
}

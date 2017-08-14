package br.pro.ramon.folha;

public abstract class Funcionario implements Comparable<Funcionario> {

    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getSalario();

    @Override
    public int compareTo(Funcionario o) {
        return this.nome.compareTo(o.nome);
    }

}

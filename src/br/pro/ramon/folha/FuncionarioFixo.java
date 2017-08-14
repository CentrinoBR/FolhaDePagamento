package br.pro.ramon.folha;

public abstract class FuncionarioFixo extends Funcionario {

    private double valor;

    public FuncionarioFixo(String nome, double valor) {
        super(nome);
        this.valor = valor;
    }

    public double getSalario() {
        return valor;
    }

}

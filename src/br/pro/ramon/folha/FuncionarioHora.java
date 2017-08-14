package br.pro.ramon.folha;

public abstract class FuncionarioHora extends Funcionario {

    private double valor;
    private double horas;

    public FuncionarioHora(String nome, double valor, double horas) {
        super(nome);
        this.valor = valor;
        this.horas = horas;
    }

    public double getSalario() {
        return horas * valor;
    }

}

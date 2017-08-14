package br.pro.ramon.folha;

public class Gerente extends FuncionarioHora {

    private double bonus;

    public Gerente(String nome, double horas, double bonus) {
        super(nome, 100, horas);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + bonus;
    }

}

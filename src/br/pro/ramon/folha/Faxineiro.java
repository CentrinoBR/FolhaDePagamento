package br.pro.ramon.folha;

public class Faxineiro extends FuncionarioFixo {

    private Turno turno;

    public Faxineiro(String nome, double valor, Turno turno) {
        super(nome, valor);
        this.turno = turno;
    }

    @Override
    public double getSalario() {
        double adicional = 0;

        if (turno == Turno.NOTURNO) {
            adicional = 0.05 * super.getSalario();
        }

        return super.getSalario() + adicional;
    }

}

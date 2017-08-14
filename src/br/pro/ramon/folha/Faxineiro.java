package br.pro.ramon.folha;

public class Faxineiro extends FuncionarioFixo {

    private String turno;

    public Faxineiro(String nome, double valor, String turno) {
        super(nome, valor);
        this.turno = turno;
    }

    @Override
    public double getSalario() {
        double adicional = 0;

        if (turno.equals("noturno")) {
            adicional = 0.05 * super.getSalario();
        }

        return super.getSalario() + adicional;
    }

}

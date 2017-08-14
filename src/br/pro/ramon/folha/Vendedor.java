package br.pro.ramon.folha;

public class Vendedor extends FuncionarioFixo {

    private double vendas;

    public Vendedor(String nome, double vendas) {
        super(nome, 2000);
        this.vendas = vendas;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + 0.1 * vendas;
    }
}

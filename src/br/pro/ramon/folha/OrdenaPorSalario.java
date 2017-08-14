package br.pro.ramon.folha;

import java.util.Comparator;

public class OrdenaPorSalario implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario o1, Funcionario o2) {
        return (int) (o1.getSalario() - o2.getSalario());
    }

}

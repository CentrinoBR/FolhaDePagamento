package br.pro.ramon.folha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Maria", 160, 1000));
        funcionarios.add(new ProgramadorJr("José", 176));
        funcionarios.add(new ProgramadorPl("Augusto", 160));
        funcionarios.add(new ProgramadorSr("Alice", 128));
        funcionarios.add(new Vendedor("Thiago", 10000));
        funcionarios.add(new Faxineiro("Ana", 720, Turno.DIURNO));
        funcionarios.add(new Faxineiro("João", 680, Turno.NOTURNO));

        System.out.print("Ordenar por (N)ome ou (S)alário? ");
        String opcao = console.nextLine();
        switch (opcao) {
            case "n":
            case "N":
                Collections.sort(funcionarios);
                break;
            case "s":
            case "S":
                Collections.sort(funcionarios, new OrdenaPorSalario());
                break;
        }

        double total = 0;
        for (Funcionario f : funcionarios) {
            System.out.printf("%-10s %8.2f%n", f.getNome(), f.getSalario());
            total += f.getSalario();
        }
        System.out.println("-------------------");
        System.out.printf("%-10s %8.2f%n", "Total", total);
    }

}

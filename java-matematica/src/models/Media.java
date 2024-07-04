package models;

import interfaces.IContas;
import java.util.Scanner;

public class Media implements IContas {
    Scanner meuLeitor = new Scanner(System.in);

    private double quantidade;
    private double valorTotal;
    private double valorFinal;

    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorFinal() {
        return valorFinal;
    }
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    @Override
    public void pegarValores() {
        double novoNumero;
        setValorTotal(0);
        System.out.println("Deseja calcular a média de quantos números?");
        setQuantidade(meuLeitor.nextDouble());

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite o valor do " + i + "º número:");
            novoNumero = meuLeitor.nextDouble();

            setValorTotal(getValorTotal() + novoNumero);
        }

    }

    @Override
    public String retornarResultado() {
        setValorFinal(getValorTotal() / getQuantidade());
        return "O Valor da média destes números é igual a " + getValorFinal();
    }
}

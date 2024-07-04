package models;

import interfaces.IContas;


public class Media extends BasicoContas implements IContas {


    private double quantidade;
    private double valorTotal;

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
    public void calcular() {
        super.setValorFinal(getValorTotal() / getQuantidade());
    }

    @Override
    public String retornarResultado() {
        return "O Valor da média destes números é igual a " + super.getValorFinal();
    }
}

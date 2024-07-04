package models;


import java.util.Scanner;

public abstract class BasicoContas {
    Scanner meuLeitor = new Scanner(System.in);

    private double valorFinal;

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}

package models;

import interfaces.IContas;

public class Bhaskara extends BasicoContas implements IContas {

    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        return delta;
    }
    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }

    @Override
    public void pegarValores() {
        System.out.println("Qual é o valor do 'a' (O valor que acompanha o X²)?");
        setA(meuLeitor.nextDouble());

        System.out.println("Qual é o valor do 'b' (O valor que acompanha o X)?");
        setB(meuLeitor.nextDouble());

        System.out.println("Qual é o valor do 'c' (O valor que não acompanha ninguém)?");
        setC(meuLeitor.nextDouble());
    }

    @Override
    public void calcular() {
        setDelta( Math.pow(this.getB(), 2) - 4 * this.getA() * this.getB() );

        setX1( (- this.getB() + Math.sqrt(this.delta))/2*this.getA() );
        setX2( (- this.getB() - Math.sqrt(this.delta))/2*this.getA() );
    }

    @Override
    public String retornarResultado() {
        return "Os dois valores deste Bhaskara é igual a " + this.getX1() + " e " + this.getX2();
    }
}

package com.company;

public class Piramide {
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcVolume(){
        return (1/3 * getBase() * getAltura());
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

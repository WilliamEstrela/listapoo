package com.company;

public class Cilindro {
    public double raio;
    public double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double calcAreaLateral(){
        // O cálculo da área lateral é (2*3.1415*raio*altura)
        return (2*3.1415*getRaio()*getAltura());
    }

    public double calcAreaTotal(){
        // área total (2*3.1415*raio*(altura+raio))
        return (2*3.1415*getRaio()*(getAltura()+getRaio()));
    }

    public double getVolume(){
        // volume (3.1415*raio*raio*altura)
        return (3.1415*getRaio()*getRaio()*getAltura());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

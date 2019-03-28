package com.company;

public class Geratriz {
    private double raio;
    private double altura;

    //raio e altura nao pode ser negativo

    public Geratriz(double raio, double altura) throws Exception {
        this.setRaio(raio);
        this.setAltura(altura);
    }

    public double calcAreaLateral(){
        return (3.1415*getRaio()*calcGeratriz());
    }
    public double calcVolume(){
        return (1.0/3.0*3.1415*(getRaio()*getRaio())*getAltura());
    }
    public double calcAreaTotal(){
        return (3.1415*getRaio()*(calcGeratriz()+getRaio()));
    }

    public double calcGeratriz(){
        double conta = (getAltura()*getAltura())+(getRaio()*getRaio());
        return Math.sqrt(conta);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exception {
        if (raio <0){
            throw new Exception("O raio nao pode ser negativo");
        }else{
            this.raio = raio;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws Exception {
        if (altura <0){
            throw new Exception("A altura nao pode ser negativo");
        }else{
            this.altura = altura;
        }
    }

}

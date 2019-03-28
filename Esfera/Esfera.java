package com.company;

public class Esfera {
    private double raio;

    public Esfera(double raio) throws Exception{
        this.setRaio(raio);
    }

    public double calcArea(){
        return (4*3.1415*getRaio()*getRaio());
    }

    public double calcVolume(){
        return ((4/3)*3.1415*getRaio()*getRaio()*getRaio());
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exception{
        if (raio < 0){
            throw new Exception("O raio nao pode ser negativo");
        }else{
            this.raio = raio;
        }
    }
}

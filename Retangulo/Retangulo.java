package com.company;

public class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) throws Exception{
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getcArea(){
        return getLargura()*getComprimento();
    }

    public void setComprimento(double comprimento) throws Exception{
        if(comprimento <0){
            throw new Exception(("O comprimento nao pode ser negativo"));
        }else{
            this.comprimento = comprimento;

        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) throws Exception{
        if(comprimento <0){
            throw new Exception(("A largura nao pode ser negativa"));
        }else{
            this.largura = largura;
        }
    }
}

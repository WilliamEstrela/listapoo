package com.company;

public class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcImc(){
        return getPeso()/getAltura()*getAltura();
    }

    public String getRisco(){
        double imc = calcImc();
        String mensagem = "";
        if ( imc < 20){
            mensagem = "A baixo do peso ideal";
        }else{
            if( imc >= 20 && imc <25){
                mensagem = "No peso ideal";
            }else{
                if(imc >= 30 && imc <35){
                    mensagem = "Obessidade";
                }else{
                    if(imc>30){
                        mensagem = "Obesidade morbita";
                    }
                }
            }
        }
       return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

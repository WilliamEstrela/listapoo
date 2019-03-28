package com.company;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    private double calcArea;

    public Triangulo(double lado1, double lado2, double lado3, double calcArea) throws Exception{
        setLado1(lado1);
        setLado2(lado2);
        setLado3(lado3);
        this.calcArea = calcArea;
    }

    public String getTypeLado(){
        String resultado = "";
        if ( getLado1()==getLado2() && getLado2() == getLado3()){
            resultado = "Equilatero";
        }
        if (getLado1() == getLado2() ||
            getLado2() == getLado3() ||
            getLado3() == getLado2() ||
            getLado3() == getLado1() ||
            getLado3() == getLado2()){
            resultado = "Isoceles";
        }
        if (getLado1() != getLado2() &&  getLado3() != getLado2()){
            resultado = "Escaleno";
        }
        return resultado;
    }

    public String getTypeAngulo(){
        String resultado = "";
        if (getLado1()*getLado1()<getLado2()*getLado2()+getLado3()+getLado3()){
            resultado = "Octuangulo";
        }
        if (Math.pow(getLado1(),2)>Math.pow(getLado2(),2)+Math.pow(getLado3(),2)){
            resultado = "Obtusangulo";
        }
        if (Math.pow(getLado1(),2)==Math.pow(getLado2(),2)+ Math.pow(getLado1(),2)){
            resultado = "Retangulo";
        }
        return resultado;
    }

    public double getArea(){
        double T = (getLado1()+getLado2()+getLado3())/2;
        return Math.sqrt(T*(T-getLado1())*(T-getLado2())*(T-getLado3()));
    }
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) throws Exception{
        if(lado1<=0){
            throw new Exception("O lado digitado está negativo");
        }else{
            this.lado1 = lado1;

        }
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2)  throws Exception{
        if(lado2<=0){
            throw new Exception("O lado digitado está negativo");
        }else{
            this.lado3 = lado2;

        }
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) throws Exception{
        if(lado3<=0){
            throw new Exception("O lado digitado está negativo");
        }else{
            this.lado3 = lado3;

        }
    }

    public double getCalcArea() {
        return calcArea;
    }

    public void setCalcArea(double calcArea) {
        this.calcArea = calcArea;
    }
}

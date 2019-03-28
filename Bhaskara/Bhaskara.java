package com.company;

public class Bhaskara {
    private int a;
    private int b;
    private int c;

    public Bhaskara(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double delta(){
        return Math.pow(getB(),2)-4*getA()*getC();
    }

    public double getResposta1(){
        return (-getC()+delta()/2*getA());
    }

    public double getResposta2(){
        return (-getC()-delta()/2*getA());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}

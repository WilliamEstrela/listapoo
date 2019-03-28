package com.company;

public class Main {

    public static void main(String[] args) {
        Paciente p = new Paciente("William",20,1.76);
        System.out.println("O IMC de " + p.getNome() + " eh " + p.calcImc() + " e a classificação de risco eh "+ p.getRisco());
    }
}

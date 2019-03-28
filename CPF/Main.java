package com.company;

public class Main {

    public static void main(String[] args) {

        ValidateCPF valida = new ValidateCPF("03497218154");

        boolean verificacao = valida.isCPF();
        System.out.println("Status:" + verificacao);
        System.out.println("CPF:" + valida.imprimeCPF());

    }
}

package com.company;


public class Main {

    public static void main(String[] args) {
        Eleitor e = new Eleitor("William Estrela Louzeiro", "23/07/1998");
        System.out.println("Hora" +e.getIdade());
        System.out.println(e.getVotaOuNaoVota());
    }
}

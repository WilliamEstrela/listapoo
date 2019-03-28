package com.company;

public class Main {

    public static void main(String[] args) {
        Geratriz g = null;
        try{
            g = new Geratriz(1,10);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        System.out.println("A geratriz eh:" + g.calcGeratriz());
    }
}

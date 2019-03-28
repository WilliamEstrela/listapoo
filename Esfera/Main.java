package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            Esfera e = new Esfera(4);
        }catch (Exception e){
            System.out.println("O raio nao pode ser negativo");
        }
    }
}

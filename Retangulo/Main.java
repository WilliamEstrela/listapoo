package com.company;

public class Main {

    public static void main(String[] args) {
        try{
            Retangulo r = new Retangulo(1,40);
        }catch (Exception e){
            System.out.println("Nao use valor negativo");
        }
    }
}

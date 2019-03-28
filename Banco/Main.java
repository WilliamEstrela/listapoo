package com.company;

public class Main {

    public static void main(String[] args) {
	    Poupannca p = null;
	    boolean A;
        try {
	        p = new Poupannca("William",001,02);
            p.deposito(100);
            A = p.saque(100);
            if(A){
                System.out.println("Saque realizado com sucesso, novo saldo: " + p.getSaldo());
            }
        }catch (Exception e){
            System.out.println("Erro: " +e.getMessage() );
        }
    }
}

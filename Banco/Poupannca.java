package com.company;

public class Poupannca {
    private String nome;
    private int numeroconta;
    private int agencia;
    private double saldo;

    public Poupannca(String nome, int numeroconta, int agencia) throws Exception{
        this.nome = nome;
        this.numeroconta = numeroconta;
        this.agencia = agencia;
        this.saldo = saldo=0;
    }

    public void deposito(double valor){
        saldo = getSaldo()+valor;
    }

    public boolean saque(double valor) throws Exception{
        if(getSaldo()>=valor){
            this.saldo = getSaldo()-valor;
            return true;
        }else{
            throw new Exception("Impossivel realizar o saque, saldo disponivel: " + getSaldo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

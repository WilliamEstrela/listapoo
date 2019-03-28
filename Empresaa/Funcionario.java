package com.company;

public class Funcionario {
    private String nome;
    private String cpf;
    private double horasTrabalhadas;
    private double valorHoras;

    public Funcionario(String nome, String cpf, double horasTrabalhadas, double valorHoras) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoras = valorHoras;
    }

    public double calcSalario(){
        return getHorasTrabalhadas()*getValorHoras();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }
}

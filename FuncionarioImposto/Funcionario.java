package com.company;

public class Funcionario {
    private String nome;
    private double salario;
    private int numeroDeFilhos;

    public Funcionario(String nome, double salario, int numeroDeFilhos) {
        this.nome = nome;
        this.salario = salario;
        this.numeroDeFilhos = numeroDeFilhos;
    }

    //calcular aumento de salário ( a porcentagem é fornecida por parâmetro);
    // calcular desconto no imposto de renda (R$1250,25 por filho) e
    // calcular INSS ( 6% para salário <= R$2545,00 e 10% para o restante).

    public double calcAumentoSalario(double porcentagem){
        double aumento = (getSalario()*porcentagem)/100;
        setSalario(aumento+getSalario());
        return aumento+getSalario();
    }

    public double calcDescontoImpostoDeRenda(){
        double desconto  = getNumeroDeFilhos()*1250.25;
        return desconto;
    }

    public double calcDesccontoInss(){
        if(getSalario()<=2645){
            double desconto = (getSalario()*6)/100;
            return desconto;
        }else{
            double desconto = getSalario()*10/100;
            return desconto;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }
}

package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Eleitor {
    private String nome;
    private String nascimento;
    private int mes;
    private int dia;
    private int ano;
    private Date data;


    public Eleitor(String nome, String nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.explodData();
    }

    public void explodData(){
        String[] exploded = getNascimento().split("/");
        setDia(Integer.parseInt(exploded[0]));
        setMes(Integer.parseInt(exploded[1]));
        setAno(Integer.parseInt(exploded[2]));
    }
    public String getVotaOuNaoVota(){
        String valor = "";
        if (getIdade()<16){
            valor = "Nao Eleitor";
        }else{
            if (getIdade() <= 16 && getIdade() <18){
                valor = "Eleitor Facultativo";
            }if(getIdade() >= 18 && getIdade() <=65){
                valor = "Eleitor obrigatorio";
            }if(getIdade() > 65){
                valor = "Eleitor facultativo";
            }
        }
        return valor;
    }

    public int getIdade(){
        int mes_atual = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
        int dia_atual = Integer.parseInt(new SimpleDateFormat("dd").format(new Date()));

        int A = (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - this.getAno());
        if (mes_atual <= this.getMes() && dia_atual <= this.getDia()) {
                A--;
        }
        return A;
    }


    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }


}

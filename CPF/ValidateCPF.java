package com.company;

public class ValidateCPF {
    private String CPF;

    public ValidateCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public  boolean isCPF() {

        if (this.getCPF().equals("00000000000") || this.getCPF().equals("11111111111") ||
                this.getCPF().equals("22222222222") || this.getCPF().equals("33333333333") ||
                this.getCPF().equals("44444444444") || this.getCPF().equals("55555555555") ||
                this.getCPF().equals("66666666666") || this.getCPF().equals("77777777777") ||
                this.getCPF().equals("88888888888") || this.getCPF().equals("99999999999") ||
                (this.getCPF().length() != 11))
            return(false);

        char dig10, dig11;
        int sm, i, r, num, peso;


        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {

                num = (int)(this.getCPF().charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char)(r + 48);

            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(this.getCPF().charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char)(r + 48);

            if ((dig10 == this.getCPF().charAt(9)) && (dig11 == this.getCPF().charAt(10)))
                return(true);
            else return(false);
        } catch (Exception erro) {
            return(false);
        }
    }

    public String imprimeCPF() {
        return(this.getCPF().substring(0, 3) + "." + this.getCPF().substring(3, 6) + "." +
                this.getCPF().substring(6, 9) + "-" + this.getCPF().substring(9, 11));
    }

}

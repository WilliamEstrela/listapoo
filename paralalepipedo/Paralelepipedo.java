public class Paralelepipedo {
    private double largura;
    private double altura;
    private double comprimento;

    public Paralelepipedo(double largura, double altura, double comprimento) {
        this.largura = largura;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public double calcVolume(){
        //calculo do volume           (3.1415*raio*raio*altura)
        return (getAltura()+getComprimento()+getLargura());
    }

    public double calcArea(){
        // ( 2 * (altura * largura + altura * comprimento + largura * comprimento)).
        return (2* (getAltura()*getLargura()+getAltura()*getComprimento()+getLargura()*getComprimento()));
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}

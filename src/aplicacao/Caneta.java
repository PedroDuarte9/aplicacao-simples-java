package aplicacao;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, double ponta, int carga, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int cc){
        this.carga = cc;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean b){
        this.tampada = b;
    }

    public void status(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Essa é a cor: " + getCor());
        System.out.println("Essa é o tamanho da ponta: " + getPonta());
        System.out.println("Essa é a carga: " + getCarga());
        System.out.println("Está tampada: " + getTampada());
    }


    public void rabiscar() {
        if (tampada == false) {
            System.out.println("Rabiscando");

        } else {
            System.out.println("Não posso rabiscar, caneta tampada");

        }
    }


    public void tampar(){
            this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }


}

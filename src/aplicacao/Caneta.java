package aplicacao;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Essa é a cor: " + cor);
        System.out.println("Essa é o tamanho da ponta: " + ponta);
        System.out.println("Essa é a carga: " + carga);
        System.out.println("Está tampada: " + tampada);
    }


    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar, caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }
    }


    public void tampar(){
            this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }


}

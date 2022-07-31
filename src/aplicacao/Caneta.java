package aplicacao;

public class Caneta {
    int carga;
    String cor;
    double ponta;
    boolean tampada;

    void status(){
        System.out.println("Essa é a carga: " + this.carga);
        System.out.println("Essa é a cor: " + this.cor);
        System.out.println("Essa é o tamanho da ponta: " + this.ponta);
    }

    void tampadaA(){
    this.tampada = true;
    }
    void destampada(){
    this.tampada = false;
    }
    void rabiscar(){
    if (this.tampada == true){
        System.out.println("Não posso rabiscar, caneta tampada");
    }else{
        System.out.println("Rabiscando");
    }

    }
}

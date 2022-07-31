package aplicacao;

public class Programa {
    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.carga = 90;
    c1.cor = "verde";
    c1.ponta = 0.5;
    c1.tampadaA();


    Caneta c2 = new Caneta();
    c2.carga = 50;
    c2.cor = "Azul";
    c2.ponta = 0.9;
    c2.destampada();


    c1.status();
    c1.rabiscar();
        System.out.println(" ");
    c2.status();
    c2.rabiscar();

    }


}
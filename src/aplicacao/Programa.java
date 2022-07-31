package aplicacao;

public class Programa {
    public static void main(String[] args) {
    Caneta c1 = new Caneta();
    c1.modelo = "Esferografica";
    c1.cor = "Amarelo";
    //c1.ponta
    c1.carga = 80;
    // c1.tampada = true;
    c1.status();
    c1.tampar();
    c1.rabiscar();


    }


}
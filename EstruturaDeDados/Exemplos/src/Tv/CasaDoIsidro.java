package Tv;

public class CasaDoIsidro {
    public static void main(String[] args) {
        Televisao t1, t2;

        t1 = new Televisao();
        t2 = new Televisao();

        t1.defineMarca("Samsung da Cozinha");
        t2.defineMarca("Samsung do Quarto");

        t1.ligar();
        t2.ligar();

        t1.defineCanal(41);
        t1.aumentaVolume(25);


        t2.defineCanal(39);
        t2.defineCanal(40);
        t2.defineCanal(88);
        t2.defineCanal(13);
        t2.defineCanal(14);
        t2.defineVolume(1);

        t1.desligar();

    }
}

package OrientacaoObjeto;

public class AppTelevisao {
    public static void main(String args[]) {
        int a;
        String b;

        Televisao t = new Televisao();
        Televisao t2 = new Televisao();

        t.marca = "LG";
        t.ligada = false;
        t.volume = 0;
        t.canal = 5;

        t.ligar();
        t.aumentarVolume();
        t.avancarCanal();
        System.out.println("------------------");

        t2.marca = "Samsung do Quarto";
        t2.ligada = true;
        t2.volume = 5;
        t2.canal = 15;

        t2.ligar();
        t2.aumentarVolume();
        t2.avancarCanal();
    }
}

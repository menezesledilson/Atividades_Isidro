package Jogo;

import java.util.ArrayList;
import java.util.Collections;

public class TestPlayer {
    public static void main(String[] args) {
        ArrayList<Player> lista = new ArrayList<Player>();

        lista.add(new Player(1, "Veno", 100.0f));
        lista.add(new Player(2, "Bull", 87.5f));
        lista.add(new Player(3, "Ghome", 86.5f));
        lista.add(new Player(4, "Rfme", 332f));
        System.out.println("****Imprimindo a lista *****");

        //Collections.sort(lista);
        for (Player p : lista) {
            System.out.println("Nomes: " + p);
        }

    }
}

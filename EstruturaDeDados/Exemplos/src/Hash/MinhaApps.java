package Hash;

import java.security.Key;
import java.util.Scanner;

import java.util.Scanner;

public class MinhaApps {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int Key;

        Registro r1 = new Registro(789,"Registro 1");
        Registro r2 = new Registro(889,"Registro 2");

        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());

        MapaHash mapa = new MapaHash(100); // Especifica o tamanho do array valores

        mapa.put(new Registro(7865, "Isidro"));
        mapa.put(new Registro(1234, "Jose"));
        mapa.put(new Registro(5678, "Nilson"));
        mapa.put(new Registro(91011, "Isis"));

        do {
            System.out.println("Digite um código de registro (-1 para sair):");
            Key = teclado.nextInt();
            if (Key != -1) {
                Registro r = mapa.get(Key);
                if (r != null) {
                    System.out.println("Registro Recuperado = " + r.getKey() + " - " + r.getValue());
                } else {
                    System.out.println("Registro não encontrado.");
                }
            }
        } while (Key != -1);
    }
}
